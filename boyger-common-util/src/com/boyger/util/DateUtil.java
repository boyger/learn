package com.boyger.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil
{
	private static final String TAG = "DateUtil";
	private static final ThreadLocal<DateFormats> THREAD_LOCAL = new ThreadLocal<DateUtil.DateFormats>()
	{
		protected DateFormats initialValue()
		{
			return new DateUtil.DateFormats();
		};
	};

	public static final long SEC_INMILLIS = 1000;
	public static final long MINUTE_IN_SEC = 60;
	public static final long MINUTE_IN_MILLIS = MINUTE_IN_SEC * SEC_INMILLIS;
	public static final long HOUR_IN_SEC = MINUTE_IN_SEC * 60;
	public static final long HOUR_IN_MILLIS = HOUR_IN_SEC * SEC_INMILLIS;
	public static final long DAY_IN_SEC = HOUR_IN_SEC * 60;
	public static final long DAY_IN_MILLIS = DAY_IN_SEC * SEC_INMILLIS;
	public static final long MONTH_IN_SEC = DAY_IN_SEC * 60;
	public static final long MONTH_IN_MILLIS = MONTH_IN_SEC * SEC_INMILLIS;

	public static Date parseYMDHMS(String str)
	{
		try
		{
			return THREAD_LOCAL.get().yyyyMMddHHmmss.parse(str);
		} catch (ParseException e)
		{
			UtilLogger.getLogger().err(TAG + ".parseyyyyMMddHHmmss err.", e);
			return null;
		}
	}

	public static String formatYMDHMS(Date date)
	{
		return THREAD_LOCAL.get().yyyyMMddHHmmss.format(date);
	}

	public static Date parseYMD(String str)
	{
		try
		{
			return THREAD_LOCAL.get().yyyyMMdd.parse(str);
		} catch (ParseException e)
		{
			UtilLogger.getLogger().err(TAG + ".parseyyyyMMdd err.", e);
			return null;
		}
	}

	public static String formatYMD(Date date)
	{
		return THREAD_LOCAL.get().yyyyMMdd.format(date);
	}

	public static long dayOffset(long one, long two)
	{
		long millisOffset = one - two;
		double days = (double) millisOffset / DAY_IN_MILLIS;
		return (long) Math.floor(days);
	}

	public static class DateFormats
	{
		public DateFormat yyyyMMdd = new SimpleDateFormat("yyyy-MM-dd");
		public DateFormat yyyyMMddHHmmss = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	}
}
