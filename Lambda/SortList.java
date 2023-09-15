package cdu.gu.demo.Lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
//排序
public class SortList {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("apple","banana","orange","apple");
        //原排序方式
        Collections.sort(list,new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                // TODO Auto-generated method stub
                return o1.compareTo(o2);
            }
        });
        //Lambda
        Collections.sort(list,(o1,o2)-> o1.compareTo(o2));
        list.forEach(System.out::println);
    }


}
