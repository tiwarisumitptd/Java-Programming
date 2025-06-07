//

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketTimeoutException;

public class Q55 {
    public static void main(String[] args) {
        Socket s = null; // Declare here so it's accessible in finally
        try {
            // 1. Create socket and connect to server (use port 80 for HTTP)
            s = new Socket();
            s.connect(new java.net.InetSocketAddress("igntu.ac.in", 80), 5000);

            // 2. Demonstrate socket properties
            System.out.println("Local Port: " + s.getLocalPort());
            System.out.println("Remote Port: " + s.getPort());
            System.out.println("Remote Address: " + s.getInetAddress().getHostAddress());
            System.out.println("Local Address: " + s.getLocalAddress().getHostAddress());

            // 3. Configure socket options
            s.setSoTimeout(3000);
            s.setKeepAlive(true);
            s.setTcpNoDelay(true);

            InputStream in = s.getInputStream();
            OutputStream out = s.getOutputStream();

            // 4. Send HTTP GET request (since port 80 expects HTTP)
            String str = "GET / HTTP/1.1\r\nHost: igntu.ac.in\r\n\r\n";
            byte[] buf = str.getBytes();
            out.write(buf);
            out.flush();

            // 5. Read with timeout
            try {
                int c;
                while ((c = in.read()) != -1) {
                    System.out.print((char) c);
                }
            } catch (SocketTimeoutException ste) {
                System.out.println("\nRead operation timed out");
            }

            // 6. Show socket status
            System.out.println("\nSocket status:");
            System.out.println("Is connected: " + s.isConnected());
            System.out.println("Is closed: " + s.isClosed());
            System.out.println("Traffic Class: " + s.getTrafficClass());

        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        } finally {
            try {
                if (s != null) {
                    s.close();
                    System.out.println("\nAfter close - Is connected: " + s.isConnected());
                    System.out.println("After close - Is closed: " + s.isClosed());
                }
            } catch (Exception e) {
                System.err.println("Error closing socket: " + e.getMessage());
            }
        }
    }
}
