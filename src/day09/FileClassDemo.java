package day09;

import java.io.File;

public class FileClassDemo {
    public static void main(String[] args) {

        File file = new File("example.txt");

        System.out.println(file.exists());
        System.out.println(file.getName());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.canRead());
        System.out.println(file.canWrite());
        System.out.println(file.length());
    }
}
