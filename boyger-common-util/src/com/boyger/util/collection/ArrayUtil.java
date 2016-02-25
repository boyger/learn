package com.boyger.util.collection;

public class ArrayUtil
{
	ArrayUtil()
	{}

	public static String join(int[] arr, String separator)
	{
		StringBuilder sb = new StringBuilder();
		return join(arr, separator, sb).toString();
	}

	public static StringBuilder join(int[] arr, String separator, StringBuilder sb)
	{
		if (arr == null || separator == null || sb == null)
			throw new IllegalArgumentException();
		for (int i : arr)
			sb.append(i).append(separator);
		if (arr.length > 0)
			sb.deleteCharAt(sb.length() - 1);
		return sb;
	}

	public static int[] split(String str, String regex)
	{
		String[] split = str.split(regex);
		int[] arr = new int[split.length];
		for (int i = 0; i < split.length; i++)
		{
			arr[i] = Integer.valueOf(split[i]);
		}
		return arr;
	}
}
