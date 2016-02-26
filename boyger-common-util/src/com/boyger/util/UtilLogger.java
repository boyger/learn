package com.boyger.util;

import com.boyger.util.log.ConsoleLogger;
import com.boyger.util.log.ILogger;

public abstract class UtilLogger implements ILogger
{
	private static ILogger log;
	private static Object lock = new Object();

	public static ILogger getLogger()
	{
		if (log == null)
		{
			synchronized (lock)
			{
				if (log == null)
					log = ConsoleLogger.instance();
			}
		}
		return log;
	}

	public static void setLogger(ILogger logger)
	{
		log = logger;
	}

	@Override
	public void err(String msg)
	{
		log.err(msg);
	}
}
