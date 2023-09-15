package cdu.gu.demo.Internet.UDP.chat;

import java.net.SocketException;

public class UDPStudent {
    public static void main(String[] args) throws SocketException {
        //开启两个线程
        new Thread(new UDPSender2(7777,"localhost",9999)).start();
        new Thread(new UDPReceive2(8888,"老师")).start();
    }
}
