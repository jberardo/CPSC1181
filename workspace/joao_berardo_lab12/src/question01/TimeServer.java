package question01;

public class TimeServer
{
	private String name;
	private String address;
	
	public TimeServer(String serverName, String serverAddress)
	{
		this.name = serverName;
		this.address = serverAddress;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getAddress()
	{
		return address;
	}

	public void setAddress(String address)
	{
		this.address = address;
	}
}