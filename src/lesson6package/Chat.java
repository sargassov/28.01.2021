package lesson6package;

import java.io.IOException;
import java.net.Socket;

public class Chat {
    private final String ADDRESS = "localhost";
    private final int PORT = 8189;

    public Chat() {
        try {
            Socket sock = new Socket(ADDRESS, PORT);
            new Client(sock, "Client");
            while(true){
                if(sock.isClosed()){
                    break;
                }
            }
            System.exit(0);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Chat();
    }
}
