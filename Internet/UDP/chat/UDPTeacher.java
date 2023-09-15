package cdu.gu.demo.Internet.UDP.chat;

import java.net.SocketException;

public class UDPTeacher {
    public static void main(String [] args) throws SocketException {
        //
        new Thread(new UDPSender2(5555,"localhost",8888)).start();
        new Thread(new UDPReceive2(9999,"学生")).start();
    }
}
