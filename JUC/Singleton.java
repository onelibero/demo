package cdu.gu.demo.JUC;

//双重效验锁实现对象单例（线程安全）
public class Singleton {
    private volatile static Singleton Instance;
    private Singleton(){}

    public static Singleton getInstance(){
        //先判断对象是否已经实例过，没有实例过才进入加锁代码
        if (Instance == null){
            //类对象加锁
            synchronized (Singleton.class){
                if (Instance == null){
                    /**
                     * 为Instance分配内存空间，初始化Instance，将Instance指向分配的内存地址
                     */
                    Instance = new Singleton();
                }
            }
        }
        return Instance;
    }
}
