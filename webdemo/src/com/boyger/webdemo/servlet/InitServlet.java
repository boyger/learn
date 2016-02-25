package com.boyger.webdemo.servlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet(loadOnStartup = 1)
public class InitServlet extends HttpServlet
{
	private static final long	serialVersionUID	= 1L;

	@Override
	public void init(ServletConfig config) throws ServletException
	{
		super.init(config);
	}
}
