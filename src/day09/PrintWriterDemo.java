package day09;

import java.io.PrintWriter;
import java.io.IOException;

public class PrintWriterDemo {
    public static void main(String[] args) throws IOException {

        PrintWriter pw = new PrintWriter("print.txt");

        pw.println("Java PrintWriter Example");
        pw.println(100);
        pw.println(true);

        pw.close();
    }
}
