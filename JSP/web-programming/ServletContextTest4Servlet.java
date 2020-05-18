package com.edu.test;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/context4")

public class ServletContextTest4Servlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse resp)throws
	ServletException, IOException{
		resp.setContentType("text/html;charset=utf-8");
		PrintWriter out = resp.getWriter();
		
		ServletContext sc = this.getServletContext();
		
		ShareObject obj1 = (ShareObject) sc.getAttribute("data1");
		ShareObject obj2 = (ShareObject) sc.getAttribute("data2");
		
		out.print("DATA1:"+obj1.getCount()+","+obj1.getStr()+"<br>");
		out.print("DATA2:"+obj2.getCount()+","+obj2.getStr()+"<br>");
		
		out.close();
	}

}
