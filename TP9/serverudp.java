import java.io.*;
import java.net.*;

public class ServeurUDP {
    public static void main(String[] args) {
        try {
            DatagramSocket socket = new DatagramSocket(5000); // port choisi
            byte[] buffer = new byte[1024];
            System.out.println("Serveur UDP en attente sur le port 5000...");

            while (true) {
                DatagramPacket paquet = new DatagramPacket(buffer, buffer.length);
                socket.receive(paquet); // attente bloquante
                String message = new String(paquet.getData(), 0, paquet.getLength());
                System.out.println("Reçu : " + message);

                // (Q2.3) renvoyer la chaîne au client
                InetAddress adresseClient = paquet.getAddress();
                int portClient = paquet.getPort();
                DatagramPacket retour = new DatagramPacket(
                        message.getBytes(), message.length(), adresseClient, portClient);
                socket.send(retour);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
