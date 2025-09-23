import java.net.*;
import java.io.*;

public class ClientTCP3 {
    public static void main(String[] args) throws Exception {
        if (args.length == 0) {
            System.out.println("Usage : java ClientTCP3 <message>");
            return;
        }

        Socket socket = new Socket("localhost", 2016);
        DataOutputStream dOut = new DataOutputStream(socket.getOutputStream());
        DataInputStream dIn = new DataInputStream(socket.getInputStream());

        dOut.writeUTF(args[0]);
        dOut.flush();

        String response = dIn.readUTF();
        System.out.println("Message inversé reçu du serveur : " + response);

        socket.close();
    }
}

