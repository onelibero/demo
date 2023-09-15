package cdu.gu.demo.Internet.UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPReceive {
    public static void main(String args[]) throws IOException {
        DatagramSocket socket = new DatagramSocket(6666);
        //准备接收

        while (true){
            //接收包裹
            byte[] container = new byte[1024];
            DatagramPacket packet = new DatagramPacket(container,0,container.length);
            socket.receive(packet);
            //断开连接
            byte[] data = packet.getData();
            String receiveData = new String(data,0,data.length);
            System.out.println(receiveData);
            if (receiveData.equals("bye")){
                break;
            }
        }
        socket.close();
    }
}
