package cdu.gu.demo.Lambda;
import java.util.Arrays;
import java.util.List;

//遍历集合
public class ForeachList {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("apple","banana","orange");
        //原遍历方式
        for(String s:list) {
            System.out.println(s);
        }
        //Lambda
        /**
         * 当只有一个参数的时候可以省略
         * list.forEach(s-> {
         * System.out.println(s))
         * }
         */
        list.forEach(System.out::println);
    }
}
