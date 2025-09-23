import java.net.*;
import java.io.*;

public class ClientTCP2 {
    public static void main(String[] args) throws Exception {
        if (args.length == 0) {
            System.out.println("Usage : java ClientTCP2 <message>");
            return;
        }

        Socket socket = new Socket("localhost", 2016);
        DataOutputStream dOut = new DataOutputStream(socket.getOutputStream());

        dOut.writeUTF(args[0]);
        dOut.flush();

        socket.close();
    }
}

