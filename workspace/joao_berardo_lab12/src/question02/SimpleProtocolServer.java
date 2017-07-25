package question02;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

// server should accept multiple simultaneous connections with different clients
// always use port number 8888
public class SimpleProtocolServer
{
	public static void main(String[] args) throws IOException
	{
		int portNumber = Integer.parseInt(args[0]);
		ServerSocket server = new ServerSocket(portNumber);

		System.out.println("Waiting for clients to connect...");
	
		while (true)
		{
			try (Socket s = server.accept())
			{
				System.out.println("Client connected.");
				SimpleProtocolService service = new SimpleProtocolService(s);
				Thread t = new Thread(service);
				t.start();
			}
		}
	}
}