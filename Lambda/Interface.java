package cdu.gu.demo.Lambda;


//函数式接口
interface MyInterface {
    public void doSomething(String s);
}

public class Interface {
    public static void main(String[] args) {
        //原方式
        MyInterface myInterface = new MyInterface() {

            @Override
            public void doSomething(String s) {
                // TODO Auto-generated method stub
                System.out.println(s);
            }
        };
        myInterface.doSomething("hello");
        //Lambda
        MyInterface myInterface1 = (s) -> System.out.println(s);
        myInterface1.doSomething("hello");
    }
}
