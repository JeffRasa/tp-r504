import java.io.*;
import java.net.*;

public class ServeurTCP1 {
    public static void main(String[] args) {
        try {
            ServerSocket server = new ServerSocket(6000);
            System.out.println("Serveur TCP1 en attente...");
            Socket socket = server.accept();
            DataInputStream dIn = new DataInputStream(socket.getInputStream());

            String msg = dIn.readUTF();
            System.out.println("Reçu : " + msg);

            socket.close();
            server.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
