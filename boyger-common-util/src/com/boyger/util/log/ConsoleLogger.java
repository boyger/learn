package com.boyger.util.log;

import java.io.PrintStream;

public class ConsoleLogger implements ILogger
{
	private static ConsoleLogger _instance = new ConsoleLogger();
	
	public static ConsoleLogger instance()
	{
		return _instance;
	}
	
	private ConsoleLogger()
	{}

	private PrintStream err = System.err;
	private PrintStream out = System.out;

	@Override
	public void err(String msg, Throwable t)
	{
		err.printf("%s - \n", msg);
		if (err != null)
		{
			t.printStackTrace(err);
		}
	}

	@Override
	public void err(String msg)
	{
		err(msg, null);
	}

	@Override
	public void warn(String msg, Throwable t)
	{
		out.printf("%s - \n", msg);
		if (t != null)
		{
			t.printStackTrace(out);
		}
	}

	@Override
	public void warn(String msg)
	{
		warn(msg, null);
	}

	@Override
	public void info(String msg)
	{
		out.printf("%s - \n", msg);
	}

	@Override
	public void debug(String msg)
	{
		out.printf("%s - \n", msg);
	}

}
