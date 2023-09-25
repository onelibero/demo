package cdu.gu.demo.Collection.Map;

import java.util.HashMap;

/**
 * 实现了map接口，用于map的一系列方法：put,replace,remove,isEmpty,containsKey,containsValue等
 * 初始化大小为16，每次扩容为原来的2的幂次方倍，取决于他的特殊算法 hash&(n-1)  [要插入的位置，因为范围为40亿，只有插入的时候才会赋给内存]
 * 线程不安全，jdk1.8之前头插可能造成循环死锁，尾插可能覆盖数据（多线程）
 * 常见遍历方式有七种，迭代器（EntrySet，KeySet），foreach（EntrySet，KeySet），Lambda，Stream流(单线程，多线程)
 */
public class HashMapText {
    public static void main(String[] args){
        HashMap<Integer,String> Text = new HashMap<>();
        Text.put(1,"first");
        Text.put(2,"second");
        Text.remove(2);
        Text.replace(1,"second");
        Text.forEach((key,value) -> {
            System.out.println(key);
            System.out.println(value);
        });
        Text.entrySet().stream().forEach((entry) -> {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        });
        Text.entrySet().parallelStream().forEach((entry) -> {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        });
        System.out.println(Text.values());
    }
}
