package cdu.gu.demo.Internet.UDP.chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketException;

public class UDPSender2 implements Runnable{
    DatagramSocket socket = null;
    BufferedReader reader = null;
    private int fromPort;
    private String toIP;
    private int toPort;

    public UDPSender2(int fromPort,String toIP,int toPort) throws SocketException {
        this.fromPort = fromPort;
        this.toIP = toIP;
        this.toPort = toPort;

        socket = new DatagramSocket(fromPort);
        reader = new BufferedReader(new InputStreamReader(System.in));

    }

    @Override
    public void run() {
        while (true){
            try {
                String data = reader.readLine();
                byte[] datas = data.getBytes();
                DatagramPacket packet = new DatagramPacket(datas,0,datas.length,new InetSocketAddress(this.toIP,this.toPort));
                socket.send(packet);
                if (data.equals("bye")){
                    break;
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        socket.close();
    }
}
