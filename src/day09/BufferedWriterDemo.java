package day09;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {
    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new FileWriter("buffered.txt"));

        bw.write("Java BufferedWriter Example");
        bw.newLine();
        bw.write("Writing text using buffer");

        bw.close();
    }
}
