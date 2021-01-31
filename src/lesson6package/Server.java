package lesson6package;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {

    public Server(){
        ServerSocket server = null;
        Socket socket;
        try {
            server = new ServerSocket(8189);
            System.out.println("Server started");
            socket = server.accept();
            System.out.println("Client connected");
            new Client(socket, "Server");
            while(true){
                if(socket.isClosed()){
                    break;
                }
            }
            server.close();
            System.exit(0);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                server.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public static void main(String[] args) {
        new Server();
    }
}