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
		//int portNumber = Integer.parseInt(args[0]);
		int portNumber = 8888;
		boolean listening = true;
		MyLogger logger = new MyLogger();
		
		System.out.println("Waiting for clients to connect...");
	
		try (ServerSocket server = new ServerSocket(portNumber))
		{
			while(listening)
			{
				new Thread(new SimpleProtocolService(server.accept())).start();				
			}
			System.out.println("Client connected.");
			logger.test();
		}
		catch (IOException ex)
		{
	         System.err.println("Could not listen on port " + portNumber);
	         System.exit(-1);
		}
	}
}