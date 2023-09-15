package cdu.gu.demo.Internet.TCP.File;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class TestFileUpload {
    public static void main(String args[]) throws UnknownHostException, IOException {
        //1.创建一个Socket连接
        Socket socket = new Socket(InetAddress.getByName("127.0.0.1"),9000);
        //2.创建一个输出流
        OutputStream os = socket.getOutputStream();
        //3.读取文件
        FileInputStream fis = new FileInputStream(new File("****.jpg"));

        //4.写出文件
        byte[] buffer = new byte[1024];
        int len;
        while((len=fis.read(buffer))!=-1) {
            os.write(buffer,0,len);
        }
        //通知服务器已经发送完毕
        socket.shutdownOutput();

        //确定服务器接收完毕
        InputStream is = socket.getInputStream();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        byte[] buffer2 = new byte[1024];
        int len2;
        while((len2=is.read(buffer2))!=-1) {
            baos.write(buffer2,0,len2);
        }
        //5.关闭资源
        baos.close();
        is.close();
        fis.close();
        os.close();
        socket.close();
    }
}
