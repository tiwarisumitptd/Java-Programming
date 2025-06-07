// Write a Java program to demonstrate File class and its function.

import java.io.File;
import java.io.IOException;

public class Q53 {
        public static void main(String[] args) {
            // Create a File object for a file named "example.txt"
            File file = new File("F1.txt");
            try {
                // Create the file if it does not exist
                if (file.createNewFile()) {
                    System.out.println("File created: " + file.getName());
                } else {
                    System.out.println("File already exists.");
                }
            } catch (IOException e) {
                System.out.println("An error occurred while creating the file.");
                e.printStackTrace();
            }

            // Demonstrate File class methods
            System.out.println("File Name: " + file.getName()); // getName()
            System.out.println("File Path: " + file.getPath()); // getPath()
            System.out.println("Absolute Path: " + file.getAbsolutePath()); // getAbsolutePath()
            System.out.println("Parent Directory: " + file.getParent()); // getParent()
            System.out.println("Exists? " + file.exists()); // exists()
            System.out.println("Can Write? " + file.canWrite()); // canWrite()
            System.out.println("Can Read? " + file.canRead()); // canRead()
            System.out.println("Is Directory? " + file.isDirectory()); // isDirectory()
            System.out.println("Is File? " + file.isFile()); // isFile()
        }
    }