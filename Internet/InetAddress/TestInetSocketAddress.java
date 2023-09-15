package cdu.gu.demo.Internet.InetAddress;


import java.net.InetSocketAddress;

public class TestInetSocketAddress {
    public static void main(String []args) {
        InetSocketAddress socketAddress = new InetSocketAddress("127.0.0.1",8080); //获取Address地址
        socketAddress.getAddress();
        socketAddress.getHostName();
        socketAddress.getPort();
        System.out.println(socketAddress);
    }
}
