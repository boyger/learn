package com.boyger.util.log;

public interface ILogger
{
	public void err(String msg, Throwable t);
	
	public void err(String msg);
	
	public void warn(String msg, Throwable t);
	
	public void warn(String msg);
	
	public void info(String msg);
	
	public void debug(String msg);
	
	
}
