import java.io.InputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
  This program demonstrates how to use a socket to communicate
  with a web server. Supply the name of the host and the
  resource on the command line, for example,
  java WebGet horstmann.com index.html .
*/
public class WebGet
{
	public static void main(String[] args) throws IOException
	{
		// Get command-line arguments
		String host;
		String resource;
		
		if (args.length == 2)
		{
			host = args[0];
			resource = args[1];
		}
		else
		{
			System.out.println("Getting / from google.com");
			host = "www.google.ca";
			resource = "/?gfe_rd=cr&amp;ei=XqpSWaqKE-fe8Aez8pPYAw";
		}
		
		// Open socket
		final int HTTP_PORT = 80;
		
		try (Socket s = new Socket(host, HTTP_PORT))
		{
			// Get streams
			InputStream instream = s.getInputStream();
			OutputStream outstream = s.getOutputStream();
			// Turn streams into scanners and writers
			Scanner in = new Scanner(instream);
			PrintWriter out = new PrintWriter(outstream);
			// Send command
			String command = "GET " + resource + " HTTP/1.1\n"
					+ "Host: " + host + "\n\n";
			out.print(command);
			out.flush();
			// Read server response

			while (in.hasNextLine())
			{
				String input = in.nextLine();
				System.out.println(input);
			}
		}
	
		final String REMOTE_HOST = "www.google.com";
		Socket s = null;

		try {
			s = new Socket(REMOTE_HOST, HTTP_PORT);
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally
		{
			if (s!= null)
			{
				try {
					s.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		try {
			if (s != null)
			{
				InputStream instream = s.getInputStream();
				OutputStream outstream = s.getOutputStream();
			}
		}
		catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Scanner in = new Scanner(instream);
		//PrintWriter out = new PrintWriter(outstream);
	}
}
