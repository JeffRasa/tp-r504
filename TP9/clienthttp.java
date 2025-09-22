import java.io.*;
import java.net.*;

public class Clienthttp {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Usage: java Clienthttp <hostname>");
            return;
        }

        try {
            Socket socket = new Socket(args[0], 80);

            PrintWriter out = new PrintWriter(socket.getOutputStream());
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            // Envoi d’une requête GET minimale
            out.println("GET / HTTP/1.1");
            out.println("Host: " + args[0]);
            out.println("Connection: close");
            out.println();
            out.flush();

            // Lecture de la réponse
            String ligne;
            while ((ligne = in.readLine()) != null) {
                System.out.println(ligne);
            }

            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
