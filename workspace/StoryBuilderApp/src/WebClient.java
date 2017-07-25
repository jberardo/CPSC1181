import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Scanner;
import java.net.Socket;
import java.net.URL;
import java.net.UnknownHostException;

public class WebClient
{

public static void main(String[] args)
{
    final String SITE = "http://horstmann.com";
    final int PORT = 80;

    String host = "google.com";
    String resource = "/";

    Scanner in = null;
    PrintWriter out = null;
    InputStream inStream = null;
    OutputStream outStream = null;

    try (Socket s = new Socket(host, PORT))
    {
        inStream = s.getInputStream();
        outStream = s.getOutputStream();
        in = new Scanner(inStream);
        out = new PrintWriter(outStream);

        String command = "GET " + resource + " HTTP/1.1\n" + "Host: " + host + "\n\n";
        out.print(command);
        out.flush();

        while (in.hasNextLine())
        {
            System.out.println(in.nextLine());
        }
        }
        catch (UnknownHostException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
