package com.edu.test;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/context1")
public class context1 extends HttpServlet{
	ServletContext sc;
	@Override
	public void init(ServletConfig config)throws ServletException{
		sc=config.getServletContext();
	}
	
	public void doGet(HttpServletRequest req, HttpServletResponse resp)throws
	ServletException, IOException{
		resp.setContentType("text/html;charset=utf-8");
		PrintWriter out = resp.getWriter();
		ServletContext sc = this.getServletContext();
		String location = sc.getInitParameter("contextConfig");
		out.print("location : "+location);
		out.print("Context : "+sc);
		out.close();
	}
}
//Context : org.apache.catalina.core.ApplicationContextFacade@9999999