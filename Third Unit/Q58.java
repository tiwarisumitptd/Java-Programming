// Write a Java program to demonstrate client and server communication through datagram (UDP).

import java.net.*;
import java.io.*;

public class Q58 {
    public static void main(String[] args) throws Exception {
        // Start the server thread
        Thread serverThread = new Thread(new UDPServer());
        serverThread.start();

        // Give the server a moment to start
        Thread.sleep(1000);

        // Start the client thread
        Thread clientThread = new Thread(new UDPClient());
        clientThread.start();
    }
}

class UDPServer implements Runnable {
    public void run() {
        try {
            DatagramSocket serverSocket = new DatagramSocket(9876);
            byte[] receiveData = new byte[1024];

            System.out.println("UDP Server is running...");

            DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
            serverSocket.receive(receivePacket);

            String clientMessage = new String(receivePacket.getData(), 0, receivePacket.getLength());
            System.out.println("Received from client: " + clientMessage);

            // Send response to client
            String response = "Hello from server";
            byte[] sendData = response.getBytes();

            InetAddress clientAddress = receivePacket.getAddress();
            int clientPort = receivePacket.getPort();
            DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, clientAddress, clientPort);
            serverSocket.send(sendPacket);

            serverSocket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class UDPClient implements Runnable {
    public void run() {
        try {
            DatagramSocket clientSocket = new DatagramSocket();
            InetAddress IPAddress = InetAddress.getByName("localhost");

            String message = "Hello from client";
            byte[] sendData = message.getBytes();
            byte[] receiveData = new byte[1024];

            DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, IPAddress, 9876);
            clientSocket.send(sendPacket);

            DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
            clientSocket.receive(receivePacket);

            String serverReply = new String(receivePacket.getData(), 0, receivePacket.getLength());
            System.out.println("Received from server: " + serverReply);

            clientSocket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
