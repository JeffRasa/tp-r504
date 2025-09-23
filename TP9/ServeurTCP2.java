import java.net.*;
import java.io.*;

public class ServeurTCP2 {
    public static void main(String[] args) throws Exception {
        ServerSocket serverSocket = new ServerSocket(2016);
        System.out.println("Serveur en écoute sur le port 2016...");

        while (true) {
            Socket clientSocket = serverSocket.accept();
            System.out.println("Client connecté : " + clientSocket.getInetAddress());

            DataInputStream dIn = new DataInputStream(clientSocket.getInputStream());
            String message = dIn.readUTF();
            System.out.println("Message reçu : " + message);

            clientSocket.close();
        }
    }
}

