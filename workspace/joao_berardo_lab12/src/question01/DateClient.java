package question01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

/**
 * This class connects to three of the NIST servers using the DAYTIME protocol <br/>
 * 
 * Protocol used: DAYTIME protocol <br/>
 * It is a simple protocol that a user connects on port 13 and sends a newline character <br/>
 * The server responds by sending back an ASCII string and then disconnects <br/>
 * 
 * Response: time string in the following format: <br/>
 * JJJJJ YR-MO-DA HH:MM:SS TT L H msADV UTC(NIST) * <br/>
 * Where: <br/>
 * JJJJJ: last five digits of the Julian data (ignore in this application) <br/>
 * YR-MO-DA: <br/>
 * - YR - last two digits of the year <br/>
 * - MO - month <br/>
 * - DA - current day <br/>
 * HH:MM:SS: time in hours, minutes and seconds in UTC (http://aa.usno.navy.mil/faq/docs/UT.html) <br/>
 * 
 * Also, this program uses an offset to correct the time to your time zone <br/>
 * 
 * @author Joao Berardo
 *
 */
public class DateClient
{
	private static ArrayList<TimeServer> servers;
	private static TimeServer ts;
	final static int TS_PORT = 13;
	
	public static void main(String[] args) throws IOException
	{
		Scanner in = null;
		PrintWriter out = null;
		String[] host = new String[3];
		String resource = "";
		String output = "";
		
		init();
		host[0] = servers.get(5).getName();
		host[1] = servers.get(8).getName();
		host[2] = servers.get(3).getName();
		resource = "\n";
		
		try(Socket socket = new Socket(host[0], TS_PORT))
		{
			InputStream instream = socket.getInputStream();
			OutputStream outstream = socket.getOutputStream();
			
			// Turn streams into scanners and writers
			in = new Scanner(instream);
			out = new PrintWriter(outstream);
			
			// Send command
			String command = resource;
			out.print(command);
			out.flush();
			
			String input = "";
			
			// Read server response
			while (in.hasNextLine())
			{
				input = in.nextLine();
				//System.out.println(input);
			}
			
			//System.out.println(DateUtil.formatDate(input));
			output = "Server                                  Local Date\n";
			output += host[0] + "       ";
			output += DateUtil.formatDate(input) + "\n";
			JOptionPane.showMessageDialog(null, output);
		}
		finally
		{
			in.close();
			out.close();
		}
		// The try -with-resources statement closes the socket
	}
	
	private static void init()
	{
		servers = new ArrayList<TimeServer>();
		
		ts = new TimeServer("time-a.nist.gov", "NIST, Gaithersburg, Maryland");
		servers.add(ts);
		ts = new TimeServer("time-b.nist.gov", "NIST, Gaithersburg, Maryland");
		servers.add(ts);
		ts = new TimeServer("time-a.timefreq.bldrdoc.gov", "NIST, Boulder, Colorado");
		servers.add(ts);
		ts = new TimeServer("time-b.timefreq.bldrdoc.gov", "NIST, Boulder, Colorado");
		servers.add(ts);
		ts = new TimeServer("time-c.timefreq.bldrdoc.gov", "NIST, Boulder, Colorado");
		servers.add(ts);
		ts = new TimeServer("utcnist.colorado.edu", "University of Colorado, Boulder");
		servers.add(ts);
		ts = new TimeServer("time.nist.gov", "NCAR, Boulder, Colorado");
		servers.add(ts);
		ts = new TimeServer("time-nw.nist.gov", "Microsoft, Redmond, Washington");
		servers.add(ts);
		ts = new TimeServer("nist1.symmetricom.com", "Symmetricom, San Jose, California");
		servers.add(ts);
		ts = new TimeServer("nist1.dc.glassey.com", "Abovenet, Virginia");
		servers.add(ts);
		ts = new TimeServer("nist1.ny.glassey.com", "Abovenet, New York City");
		servers.add(ts);
		ts = new TimeServer("nist1.sj.glassey.com", "Abovenet, San Jose, California ");
		servers.add(ts);
		ts = new TimeServer("nist1.aol-ca.truetime.com", "TrueTime, AOL facility, Sunnyvale, California");
		servers.add(ts);
		ts = new TimeServer("nist1.aol-va.truetime.com", "TrueTime, AOL facility, Virginia");
		servers.add(ts);
	}
}