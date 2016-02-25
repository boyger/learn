package com.boyger.webdemo.filter;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

@WebFilter(filterName = "LogFilter", urlPatterns = "/*")
public class LogFilter extends AbstractFilter
{

	@Override
	public void doFilter(ServletRequest servletrequest, ServletResponse servletresponse, FilterChain filterchain) throws IOException, ServletException
	{
		HttpServletRequest request = (HttpServletRequest) servletrequest;
		long t0 = System.currentTimeMillis();
		filterchain.doFilter(servletrequest, servletresponse);
		long t1 = System.currentTimeMillis();
		log(String.format("%s. Cost millis: %d", request.getServletPath(), t1 - t0));
	}

	private void log(String msg)
	{
		String format = String.format("[%s] called:%s", config.getFilterName(), msg);
		config.getServletContext().log(format);
	}
}
