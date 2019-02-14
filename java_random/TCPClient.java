import java.io.*;
import java.net.*;

public class TCPClient{
	public static void main (String agrv[])throws Exception
	{
		String sentence ;
		String modifiedSentence;
		BufferedReader inFromUser = new BufferedReader(new InputStreamReader (System.in));
		Socket clientSocket = new Socket ("localhost",5789);
		DataOutputStream outToServer = new DataOutputStream( clientSocket.getOutputStream() );
		BufferedReader inFromServer = new BufferedReader(new InputStreamReader (clientSocket.getInputStream()));
		sentence = inFromUser.readLine();
		outToServer.writeBytes(sentence);
		modifiedSentence = inFromServer.readLine();
		System.out.println("From Server "+modifiedSentence );
		clientSocket.close();
	}
}