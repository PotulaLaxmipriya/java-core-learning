package day09;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
    public static void main(String[] args) throws IOException {

        FileWriter writer = new FileWriter("data.txt");

        writer.write("Java File Handling");
        writer.write("\nLearning FileWriter");

        writer.close();
    }
}
