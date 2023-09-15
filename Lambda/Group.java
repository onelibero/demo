package cdu.gu.demo.Lambda;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//分组
public class Group {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple","banana","orange");
        //原方式
        Map<Integer,List<String>> groups = new HashMap<>();
        for(String s:list) {
            int length = s.length();
            if(!groups.containsKey(length)) {
                groups.put(length, new ArrayList<>());
            }
            groups.get(length).add(s);
        }
        //Lambda
        /**
         * String::length  相当于 s-> s.length()
         */
        Map<Integer,List<String>> groups1 = list.stream().collect(Collectors.groupingBy(String::length));

        System.out.println(groups);
        System.out.println(groups1);
    }
}
