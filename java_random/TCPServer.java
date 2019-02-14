import java.io.*;
import java.net.*;

public class TCPServer{
	public static void main (String argv []) throws Exception
	{
		String clientSentence;
		String capitalisedSentence;
		ServerSocket welcomeSocket = new ServerSocket(5789);
		while(true)
		{
			Socket connectionSocket = welcomeSocket.accept();
			BufferedReader  inFromClient = new BufferedReader(new InputStreamReader (connectionSocket.getInputStream()));
			DataOutputStream outToClient= new DataOutputStream(connectionSocket.getOutputStream());
			clientSentence = inFromClient.readLine();
			capitalisedSentence = clientSentence.toUpperCase();
			outToClient.writeBytes(capitalisedSentence);
			
		}
	}
}