package com.boyger.webdemo.filter;

import javax.servlet.Filter;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;

public abstract class AbstractFilter implements Filter
{
	protected FilterConfig	config;

	@Override
	public void init(FilterConfig filterconfig) throws ServletException
	{
		this.config = filterconfig;
	}

	@Override
	public void destroy()
	{}
}
