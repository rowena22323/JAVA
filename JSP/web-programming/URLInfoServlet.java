package com.edu.test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/urlInfo")
public class URLInfoServlet extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse res)throws
	ServletException, IOException{
		res.setContentType("test/html;charset=EUC-KR");
		PrintWriter out = res.getWriter();
		out.print("<html>");
		out.print("<head><title>Request 정보 출력</head></title>");
		out.print("<body>");
		out.print("<h3>요청 방식과 프로토콜 정보</h3>");
		out.print("Reauest URI : "+req.getRequestURI()+"<br/>");
		out.print("Reauest URL : "+req.getRequestURL()+"<br/>");
		out.print("Context Path : "+req.getContextPath()+"<br/>");
		out.print("Reauest Protocol : "+req.getProtocol()+"<br/>");
		out.print("Servlet Path : "+req.getServletPath()+"<br/>");
		out.print("</body></html>");
		out.close();
	}
}
