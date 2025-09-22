import java.io.*;
import java.net.*;

public class ServeurTCP3 {
    public static void main(String[] args) {
        try {
            ServerSocket server = new ServerSocket(6000);
            System.out.println("Serveur TCP3 en attente...");
            while (true) {
                Socket socket = server.accept();
                DataInputStream dIn = new DataInputStream(socket.getInputStream());
                DataOutputStream dOut = new DataOutputStream(socket.getOutputStream());

                String msg = dIn.readUTF();
                System.out.println("Reçu : " + msg);

                // inverser la chaîne
                String rev = new StringBuilder(msg).reverse().toString();
                dOut.writeUTF(rev);
                dOut.flush();

                socket.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
