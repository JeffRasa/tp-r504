import java.net.*;

public class UdpSender {
    public static void main(String[] args) throws Exception {
        InetAddress addr = InetAddress.getLocalHost();
        System.out.println("adresse = " + addr.getHostName());

        byte[] data = "Hello, UDP!".getBytes();
        DatagramPacket packet = new DatagramPacket(data, data.length, addr, 1234);
        DatagramSocket sock = new DatagramSocket();
        sock.send(packet);
        sock.close();
    }
}
