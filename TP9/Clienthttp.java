import java.net.*;
import java.io.*;

public class Clienthttp {
	public static void main(String[] args) throws Exception {
		Socket socket = new Socket("example.com", 80);

		OutputStreamWriter osw = new OutputStreamWriter( socket.getOutputStream() );
		InputStreamReader isw = new InputStreamReader( socket.getInputStream() );

		BufferedWriter bufOut = new BufferedWriter( osw );
		BufferedReader bufIn = new BufferedReader( isw );

		String request = "GET / HTTP/1.0\r\n\r\n"; // requete HTTP
		bufOut.write( request, 0, request.length() );
		bufOut.flush();

		String line = bufIn.readLine(); // lecture ligne par ligne
		while ( line != null ) {        // tant qu'il y a des donnees recues,
			System.out.println( line ); // les afficher
			line = bufIn.readLine();
		}
		bufIn.close();
		bufOut.close();
		socket.close();
	}
}
