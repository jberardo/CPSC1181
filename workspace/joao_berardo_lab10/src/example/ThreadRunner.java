package example;

import java.text.DateFormat;
import java.util.Date;

public class ThreadRunner
{
	static class MyRunner implements Runnable
	{
		String msg;
		
		public void setMsg(String newMsg)
		{
			this.msg = newMsg;
		}

		public MyRunner()
		{
			msg = "";
		}
		
		public void run()
		{
			try
			{
				for (int i = 0; i < 100; i++)
				{
					Date now = new Date();
					System.out.println(now + ": " + msg);
					Thread.sleep(100);
				}
			}
			catch (InterruptedException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args)
	{
		for (int i = 0; i < 10; i++)
		{
			Runnable r = new MyRunner();
			Thread t = new Thread(r);
			((MyRunner) r).setMsg(t.getName() + " => " + i);
			t.start();			
		}
	}
}