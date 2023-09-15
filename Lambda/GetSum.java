package cdu.gu.demo.Lambda;


import java.util.Arrays;
import java.util.List;

//计算和
public class GetSum {
    public static void main(String[] args) {
        List<Integer> list =  Arrays.asList(1,2,3,4,5);
        //原方式
        int sum = 0;
        for(Integer integer:list) {
            sum += integer;
        }
        System.out.println(sum);
        //Lambda
        /**
         * 0是起始值，后面的意思是计算a+b两个参数的值并且返回给0
         */
        int sum1 = list.stream().reduce(0, (a,b)-> a+b);
        System.out.println(sum1);
    }
}
