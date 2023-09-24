package cdu.gu.demo.Collection.List;

import java.util.LinkedList;

public class LinkedListText {
    public static void main(String[] args){
        LinkedList<String> list = new LinkedList<>();
        //添加
        list.add("apple");
        //指定位置
        list.add(1,"banana");
        //修改
        list.set(1,"pear");
        //获取
        list.get(1);
        //删除指定位置
        list.remove(1);
        //删除第一次出现的
        list.remove("apple");
        //获取长度
        list.size();
        //清空链表
        list.clear();
        //Lambda表达式遍历集合
        list.forEach(System.out::println);
    }
}
