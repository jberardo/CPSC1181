package test;

import logz.MyLogger;

public class OtherTest
{
	private String msg;
	
	public OtherTest()
	{
		MyLogger.log("OtherTest constructor");
		msg = "";
	}

	public String getMsg() {
		MyLogger.log("Inside getMsg: " + msg);
		return msg;
	}

	public void setMsg(String msg) {
		MyLogger.log("Inside setMsg: " + msg);
		this.msg = msg;
	}
}