// Write a Java program to demonstrate FileInputStream and FileOutputStream class and its
//function.

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Q51 {
    public static void main(String args[]) throws IOException {
        File file = new File("F1.txt");
        FileInputStream fis = new FileInputStream(file);
        byte bytes[] = new byte[(int) file.length()];

        fis.read(bytes);

        File out = new File("F2.txt");
        FileOutputStream outputStream = new FileOutputStream(out);

        outputStream.write(bytes);
        outputStream.flush();
        System.out.println("Data successfully written in the specified file");
    }
}