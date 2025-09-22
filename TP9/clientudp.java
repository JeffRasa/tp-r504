import java.io.*;
import java.net.*;

public class ClientUDP {
    public static void main(String[] args) {
        try {
            DatagramSocket socket = new DatagramSocket();
            String s = "Hello World";
            byte[] data = s.getBytes();

            InetAddress serveur = InetAddress.getByName("localhost");
            DatagramPacket paquet = new DatagramPacket(data, data.length, serveur, 5000);
            socket.send(paquet);

            // attendre la réponse du serveur (Q2.3)
            byte[] buffer = new byte[1024];
            DatagramPacket reponse = new DatagramPacket(buffer, buffer.length);
            socket.receive(reponse);
            String msg = new String(reponse.getData(), 0, reponse.getLength());
            System.out.println("Réponse du serveur : " + msg);

            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
