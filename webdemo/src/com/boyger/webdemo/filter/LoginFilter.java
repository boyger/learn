package com.boyger.webdemo.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@WebFilter(filterName = "LoginFilter", urlPatterns = "/*")
public class LoginFilter implements Filter
{
	private FilterConfig	config;

	@Override
	public void init(FilterConfig filterconfig) throws ServletException
	{
		this.config = filterconfig;
	}

	@Override
	public void destroy()
	{}

	@Override
	public void doFilter(ServletRequest servletrequest, ServletResponse servletresponse, FilterChain filterchain) throws IOException, ServletException
	{
		HttpServletRequest req = (HttpServletRequest) servletrequest;
		HttpSession session = req.getSession();
		config.getServletContext().log(config.getFilterName() + "doFilter");
		filterchain.doFilter(servletrequest, servletresponse);
	}

}
