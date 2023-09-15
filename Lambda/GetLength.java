package cdu.gu.demo.Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//计算长度
public class GetLength {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple","banana","orange");
        //原方式
        List<Integer> list1 = new ArrayList<>();
        for(String s:list) {
            list1.add(s.length());
        }
        //Lambda
        /**
         * map对每个流中的元素做了转换操作
         */
        List<Integer> list2 = list.stream().map(s -> s.length()).collect(Collectors.toList());

        list1.forEach(System.out::println);
        list2.forEach(System.out::println);
    }
}
