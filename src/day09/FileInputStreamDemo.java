package day09;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo {
    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("output.txt");

        int data;

        while((data = fis.read()) != -1){
            System.out.print((char)data);
        }

        fis.close();
    }
}
