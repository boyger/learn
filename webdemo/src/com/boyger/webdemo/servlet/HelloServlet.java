package com.boyger.webdemo.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value = "/hello", loadOnStartup = 1)
public class HelloServlet extends HttpServlet
{
	private static final long	serialVersionUID	= 1L;

	@Override
	public void init() throws ServletException
	{
		log("init invoked");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		resp.getWriter().write("Hello! " + req.getRemoteHost());
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{}

	@Override
	public void destroy()
	{
		log("destory invoked");
	}
}
