package cdu.gu.demo.Lambda;


import java.util.Optional;

//创建新线程和判空
public class AboutThread {
    public static void main(String[] args) {
        //原方式
        Thread thread = new Thread(new Runnable() {

            @Override
            public void run() {
                // TODO Auto-generated method stub
                System.out.println("hello");
            }
        });
        thread.start();
        //Lambda
        Thread thread1 = new Thread(() -> System.out.println("hello"));
        thread1.start();

        //原方式
        String str = "hello";
        if(str != null) {
            System.out.println(str.toUpperCase());
        }
        //Lambda
        Optional.ofNullable(str).map(String::toUpperCase).ifPresent(System.out::println);



    }
}
