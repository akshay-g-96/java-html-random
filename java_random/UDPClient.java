import java.io.*;
import java.net.*;

public class UDPClient{
	public static void main (String argv [])throws Exception
	{
		BufferedReader inFromUser = new BufferedReader (new InputStreamReader(System.in));
		DatagramSocket clientsocket = new DatagramSocket();
		InetAddress IPAddress = InetAddress.getByName("hostname");
		byte[] receiveData = new byte [1024];
		byte[] sendData= new byte[1024];
	}
}