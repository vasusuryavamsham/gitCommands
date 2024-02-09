package com.task;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginInfo extends HttpServlet{
public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException
	{
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		String name=request.getParameter("username");
		String pwd=request.getParameter("password");
		if(name==null && pwd=="") {
			pw.print("Please enter valid username & password");
		}
		else if(name.equals("admin")&& pwd.equals("admin")) {
			pw.println("Login is Success");
		}
		else
		{
			pw.println("Login is failed & check u r credentials");
		}
		
	}

}