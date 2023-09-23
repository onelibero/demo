package cdu.gu.demo.Text;

import cdu.gu.demo.JUC.Singleton;

public class A implements B{
    public static void main(String args[]){
        int i;
        A a1=new  A();
        i =a1.k;

        Singleton instance = Singleton.getInstance();
        instance.get();

    }
}
interface B{
    int k=10;
}