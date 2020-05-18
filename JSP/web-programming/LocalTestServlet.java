package com.edu.test;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/local")
public class LocalTestServlet extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse res)throws 
	ServletException, IOException{
		int number = 0;
		String str = req.getParameter("msg");
		res.setContentType("text/html;charset=utf-8");
		PrintWriter out = res.getWriter();
		out.print("<html><head><title>MultiThread Test</title></head>");
		out.print("<body><h2>처리결과(지역변수)</h2></body>");
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
