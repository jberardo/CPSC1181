package question02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Logger;

public class SimpleProtocolService implements Runnable
{
	private final int PORT = 8888;
	private final String ADDRESS = "localhost";
	private MyLogger logger;
	
	Socket socket;
	PrintWriter out;
	BufferedReader in;
	
	private int countRequests;
	
	public SimpleProtocolService(Socket aSocket)
	{ 
		this.socket = aSocket;
		countRequests = 1;
		try {
			logger = new MyLogger();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void run()
	{
		try
		{
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new PrintWriter(socket.getOutputStream(), true);
			String command = "";
			
			while ((command = in.readLine()) != null)
			{
				if (command.equals("QUIT"))
				{
					out.printf("Bye bye..");
					break;
				}

				doService(command);
			}
			
			// close socket!!
			socket.close();	
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}

	private void doService(String command) throws IOException
	{ 
			executeCommand(command);
	}
	
	private void executeCommand(String command)
	{
		// Commands:
		// HELLO -> Sends a greeting
		// ECHO n -> n
		// COUNT -> returns the number of ECHO requests
		// QUIT -> prints goodbye and exit
		
		if (command.length() < 4)
		{
			out.println("Invalid command.");
		}
		
		switch (command.split(" ")[0])
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
		countRequests++;
		
		// "ECHO " => length = 5
		if (command.length() <= 5)
		{
			out.printf("Usage: ECHO n\n");
			return;
		}
		
		out.printf("ECHO => %s\n", command.replace("ECHO ", ""));
		out.flush();
	}

	private void count()
	{
		out.printf("%d\n", countRequests);
		out.flush();
	}
	
	private void defaultResponse()
	{
		try
		{
			this.socket.close();
		}
		catch (IOException e) {	}
		//out.printf("ops");
		//out.flush();
	}
}