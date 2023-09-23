package cdu.gu.demo.Collection.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * ArrayList实现了list接口，拥有list接口的一系列方法，底层是动态数据也拥有数组的一系列方法
 * 主要阐述其底层的System.arraycopy()方法和Arrays.copyOf()方法
 * 因为对于ArrayList的扩容操作和添加转换数组等操作都用到了这两个方法
 */
public class ArrayListText {
    public static void main(String[] args){
        List<Integer> Text = new ArrayList<>();
        Text.add(1);
        Text.add(2);
        int [] a = new int[10];
        int [] b = new int[10];
        for (int i=0;i<a.length;i++){a[i]=1;}
        /**
         * 复制数组
         * @param a 原数组
         * @param 0 原数组起始位置
         * @param b 目标数组
         * @param 0 目标数组起始位置
         * @param 2 复制长度
         */
        System.arraycopy(a,0,b,0,2);
        for (int i=0;i<b.length;i++){
            System.out.println(b[i]);
        }
        /**
         * 返回一个数组
         * @param a 要复制的数组
         * @param a 要复制的长度
         */
        int c [] = Arrays.copyOf(a,2);
        for (int i=0;i<c.length;i++){
            System.out.println(c[i]);
        }

        ArrayList<Object> list = new ArrayList<Object>();
        final int N = 10000000;
        //添加大量元素之前使用该方法以减少增量重新分配的次数
        list.ensureCapacity(N);
        for (int i = 0; i < N; i++) {
            list.add(i);
        }
    }
}
