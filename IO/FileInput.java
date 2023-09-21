package cdu.gu.demo.IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class FileInput {

    public static void main(String [] args){
        try(InputStream fis = new FileInputStream("input.txt")){
            System.out.println("Number of remaining bytes:"+fis.available());
            int content;
            long skip = fis.skip(2);
            System.out.println(skip);
            while ((content = fis.read())!=-1)
            System.out.print((char) content);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
