package testServer;

import java.io.IOException;
import java.net.ServerSocket;
import java.util.concurrent.locks.Lock;

public class Server implements Runnable
{
	private final int PORT = 8000;
	private ServerSocket server;
	Lock lock;
	
	public Server()
	{
		try
		{
			server = new ServerSocket(PORT);		
		}
		catch (IOException ex)
		{
			System.out.println("Error connecting to server");
		}
		
		lock = null;
	}

	@Override
	public void run()
	{	
		System.out.println("Running");
	}
}