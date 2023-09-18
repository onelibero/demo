package cdu.gu.demo.Text;

import java.util.Comparator;
import java.util.TreeMap;

public class Test2 {
    public Integer age;
    public Test2(Integer age){
        this.age = age;
    }
    public Integer getAge(){
        return age;
    }
    public static void main(String [] args){
        TreeMap<Test2,String> treeMap = new TreeMap<>(Comparator.comparing(Test2::getAge));
        treeMap.put(new Test2(3), "person1");
        treeMap.put(new Test2(18), "person2");
        treeMap.put(new Test2(35), "person3");
        treeMap.put(new Test2(16), "person4");
        int n=-1;
       System.out.println(~n);
       treeMap.entrySet().stream().forEach(p -> System.out.println(p.getValue()));
    }
}
