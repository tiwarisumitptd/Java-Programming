// Write a Java program to demonstrate URLConnection class and its functions.

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;

public class Q56 {
        public static void main(String args[]) throws Exception
        {
            int c;
            //URL hp = new URL("http://www.google.com");
            URL hp = new URL("http://www.internic.net");
            URLConnection hpCon = hp.openConnection();

            long d = hpCon.getDate();
            if(d==0)
                System.out.println("No date information.");
            else
                System.out.println("Date: " + new Date(d));

            System.out.println("Content-Type: " + hpCon.getContentType());


            d = hpCon.getExpiration();
            if(d==0)
                System.out.println("No expiration information.");
            else
                System.out.println("Expires: " + new Date(d));


            d = hpCon.getLastModified();
            if(d==0)
                System.out.println("No last-modified information.");
            else
                System.out.println("Last-Modified: " + new Date(d));


            int len = hpCon.getContentLength();
            if(len == -1)
                System.out.println("Content length unavailable.");
            else
                System.out.println("Content-Length: " + len);


            if(len != 0)
            {
                InputStream input = hpCon.getInputStream();
                int i = len;
                while (((c = input.read()) != -1)) { // && (--i > 0)) {
                    System.out.print((char) c);}
                input.close();
            }
            else
            {
                System.out.println("No content available.");
            }
        }
    }
