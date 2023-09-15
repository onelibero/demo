package cdu.gu.demo.Internet.InetAddress;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class TestInetAddress {
    public static void main(String [] arg) {
        try {
            //查询本机地址
            InetAddress inetAddress1 = InetAddress.getByName("127.0.0.1");
            System.out.println(inetAddress1);
            InetAddress inetAddress2 = InetAddress.getByName("localhost");
            System.out.println(inetAddress2);
            InetAddress inetAddress3 = InetAddress.getLocalHost();
            System.out.println(inetAddress3);
            //查询网站ip地址
            InetAddress inetAddress4 = InetAddress.getByName("www.baidu.com");
            System.out.println(inetAddress4);

            //常用方法
            System.out.println(inetAddress4.getAddress());
            System.out.println(inetAddress4.getCanonicalHostName()); //规范名字
            System.out.println(inetAddress4.getHostAddress()); //ip
            System.out.println(inetAddress4.getHostName()); //域名
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }

    }
}
