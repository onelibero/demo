package cdu.gu.demo.Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
//取出a开头的
public class GetStartWith {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple","banana","orange");
        //原方式
        List<String> list1 = new ArrayList<>();
        for(String s : list) {
            if(s.startsWith("a")) {
                list1.add(s);
            }
        }
        //Lambda
        /**
         * 从流中获取，filter是过滤条件，将获取的数据转成集合
         */
        List<String> list2 = list.stream().filter(s -> s.startsWith("a")).collect(Collectors.toList());


        list1.forEach(System.out::println);
        list2.forEach(System.out::println);
    }
}