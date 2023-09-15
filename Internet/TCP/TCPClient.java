package cdu.gu.demo.Internet.TCP;


import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

//客户端
public class TCPClient {
    public static void main(String []args) throws IOException {
        InetAddress ServerIp = null;
        Socket socket = null;
        OutputStream os = null;
        try {
            System.out.println("开启本地9999端口客户端");
            //1.要知道服务器的地址
            ServerIp = InetAddress.getByName("127.0.0.1");
            int port = 9999;
            // 2.创建一个socket连接
            socket = new Socket(ServerIp,port);
            // 3.发送消息IO流
            os = socket.getOutputStream();
            os.write("你好".getBytes());
        } catch(UnknownHostException e) {
            e.printStackTrace();
        } finally {
            System.out.println("客户端关闭了");
            if(os != null) {
                os.close();
            }
            if(socket != null) {
                socket.close();
            }

        }
    }
}
