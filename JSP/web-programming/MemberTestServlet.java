package com.edu.test;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/member")
public class MemberTestServlet extends HttpServlet{
	
	String str;
	public void doGet(HttpServletRequest req, HttpServletResponse res)throws 
	ServletException, IOException{
		int number = 0;
		str = req.getParameter("msg");
		res.setContentType("text/html;charset=utf-8");
		PrintWriter out = res.getWriter();
		out.println("<html><head><title>MultiThread Test</title></head>");
		out.println("<body><h2>처리결과(멤버변수)</h2></body>");
		while(number++ <10) {
			out.print(str+":"+number+"<br>");
			out.flush();
			System.out.println(str+":"+number);
			try {
				Thread.sleep(1000);
			}catch (Exception e) {
				System.out.println(e);
			}
		}
		out.println("<h2>Done"+str+"!!</h2>");
		out.println("</body></html>");
		out.close();
	}
}
