package cdu.gu.demo.Internet.TCP.File;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TestFileGet {
    public static void main(String[] args) throws IOException {
        //1.创建服务器
        ServerSocket serverSocket = new ServerSocket(9000);
        //2.监听客户端的连接
        Socket socket = serverSocket.accept(); //阻塞式监听，一直等待客户端连接
        //3.获取输入流
        InputStream is = socket.getInputStream();
        //4.文件输出
        FileOutputStream fos = new FileOutputStream(new File("receive"));
        byte[] buffer = new byte[1024];
        int len;
        while((len=is.read(buffer))!=-1) {
            fos.write(buffer,0,len);
        }

        //通知客户端已经接收
        OutputStream os = socket.getOutputStream();
        os.write("接收完毕".getBytes());

        //5.关闭资源
        fos.close();
        is.close();
        socket.close();
        serverSocket.close();
    }
}
