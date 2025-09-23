import java.net.*;

public class serverudp {
    public static void main(String[] args) throws Exception {
        DatagramSocket sock = new DatagramSocket(1234);
        byte[] buffer = new byte[1024];

        while (true) {
            System.out.println("- En attente de donnés");
            DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
            sock.receive(packet);

            String message = new String(packet.getData(), 0, packet.getLength());
            System.out.println("Reçut: " + message);
        }
    }
}

