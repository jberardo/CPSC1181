package question02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class SimpleProtocolService implements Runnable
{
	private final int PORT = 8888;
	private final String ADDRESS = "localhost";
	
	Socket socket;
	
	private int countRequests;
	
	public SimpleProtocolService(Socket aSocket)
	{ 
		this.socket = aSocket;
		countRequests = 1;
	}

	public void run()
	{
		try(BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
				)
		{
			
			doService();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}

	public void doService() throws IOException
	{ 
		while (true)
		{
			if (!in.hasNext())
			{
				return;
			}
			
			String command = in.next();

			if (command.equals("QUIT"))
			{
				out.printf("Bye bye..");
				return;
			}
			else
			{
				executeCommand(command);
			}
		}
	}
	
	private void executeCommand(String command)
	{
		// Commands:
		// HELLO -> Sends a greeting
		// ECHO n -> n
		// COUNT -> returns the number of ECHO requests
		// QUIT -> prints goodbye and exit
		
		switch (command)
		{
			case "HELLO": hello(); break;
			case "ECHO": echo(command); break;
			case "COUNT": count(); break;
			default: defaultResponse(); break;
		}
	}
	
	private void hello()
	{
		out.printf("Hello there!\n");
		out.flush();
	}
	
	private void echo(String command)
	{
		out.printf("%s\n", command.replace("ECHO ", ""));
		out.flush();
	}

	private void count()
	{
		out.printf("%d\n", countRequests);
		countRequests++;
		out.flush();
	}
	
	private void defaultResponse()
	{
		out.printf("Invalid command\n");
		out.flush();
	}
}