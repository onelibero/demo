package cdu.gu.demo.Internet.URL;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class URLDown {
    public static void main(String [] args) throws IOException {
        //1.下载地址
        URL url = new URL("下载的文件地址");
        //连接到这个这个资源 HTTP
        HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();

        InputStream inputStream = urlConnection.getInputStream();

        FileOutputStream fos = new FileOutputStream("文件名");
        byte[] buffer = new byte[1024];
        int len;
        while((len = inputStream.read(buffer))!=-1){
            fos.write(buffer,0,len); //写出这个数据
        }
        fos.close();
        inputStream.close();
        urlConnection.connect();
    }
}
