// Write a Java program to demonstrate URL class and its functions.

import java.net.MalformedURLException;
import java.net.URL;

public class Q57 {
        public static void main(String args[]) throws MalformedURLException
        {
            URL hp = new URL("https://www.google.com/");
            System.out.println("Protocol: " + hp.getProtocol());
            System.out.println("Port: " + hp.getPort());
            System.out.println("Host: " + hp.getHost());
            System.out.println("File: " + hp.getFile());
            System.out.println("Ext:" + hp.toExternalForm());
        }
    }
