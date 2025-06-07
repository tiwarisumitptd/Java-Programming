// Write a Java program to demonstrate client and server communication through socket (TCP).
import java.io.*;
import java.net.*;

 class Q59 {
   public static void main(String[] args) throws Exception {

    // Start the server in a new thread
    Thread serverThread = new Thread(() -> {
     try {
      ServerSocket serverSocket = new ServerSocket(1234);
      System.out.println("Server is waiting for client...");
      Socket socket = serverSocket.accept();
      System.out.println("Client connected!");

      // Read message from client
      BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
      String message = in.readLine();
      System.out.println("Server received: " + message);

      // Send response to client
      PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
      out.println("Hello from Server!");

      socket.close();
      serverSocket.close();
     } catch (IOException e) {
      e.printStackTrace();
     }
    });

    serverThread.start(); // Start the server

    // Wait a little to ensure server starts before client
    Thread.sleep(1000);

    // Now start the client
    Socket clientSocket = new Socket("localhost", 1234);
    System.out.println("Client connected to server!");

    // Send message to server
    PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
    out.println("Hello from Client!");

    // Read response from server
    BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
    String reply = in.readLine();
    System.out.println("Client received: " + reply);

    clientSocket.close();
   }
  }