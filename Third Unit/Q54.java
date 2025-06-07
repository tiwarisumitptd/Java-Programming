// Write a Java program to demonstrate INetAddress class and its functions.

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Q54 {
        public static void main(String args[]) throws Exception {
            int c;
            Socket s = new Socket("igntu.ac.in", 27);
            InputStream in = s.getInputStream();
            OutputStream out = s.getOutputStream();
            String str = ("ok") + "\n";
            byte buf[] = str.getBytes();
            out.write(buf);
            while ((c = in.read()) != -1) {
                System.out.print((char) c);
            }
            s.close();
        }
    }