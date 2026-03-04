package day09;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {
    public static void main(String[] args) throws IOException {

        FileOutputStream fos = new FileOutputStream("output.txt");

        String text = "Java FileOutputStream Example";

        byte[] data = text.getBytes();

        fos.write(data);

        fos.close();
    }
}