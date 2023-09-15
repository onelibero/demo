package cdu.gu.demo.Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

//流水线
public class GetStartWith2 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple","banana","orange");
        //原方式
        List<String> list1 = new ArrayList<>();
        for(String s : list) {
            if(s.startsWith("a")) {
                list1.add(s.toUpperCase());
            }
        }
        Collections.sort(list1);
        //Lambda
        List<String> list2 = list.stream().filter(s -> s.startsWith("a"))
                .map(String::toUpperCase).sorted().collect(Collectors.toList());

        System.out.println(list1);
        System.out.println(list2);
    }
}
