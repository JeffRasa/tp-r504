import java.net.*;

public class clientudp {
    public static void main(String[] args) throws Exception {
        InetAddress addr = InetAddress.getByName("localhost");
        System.out.println("Envoye à l'adresse = " + addr.getHostAddress());

        byte[] data = "Hello, UDP!".getBytes();
        DatagramPacket packet = new DatagramPacket(data, data.length, addr, 1234);
        DatagramSocket sock = new DatagramSocket();
        sock.send(packet);
        System.out.println("Message envoyé");
        sock.close();
    }
}

