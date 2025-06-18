package com.tot.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.PrintWriter;
import java.util.Date;
import java.io.IOException;

public class XMLServlet extends HttpServlet
{
	public void service(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
	{
		res.setContentType("text/xml");

		PrintWriter pw=res.getWriter();

        

		Date d=new Date();

		pw.println("<table border='1' align='center'>");

		pw.println("<tr><th>actor</th><th>actress</th><th>movie</th></tr>");
		pw.println("<tr><th>Vicky Kaushal</th><th>Rashmika</th><th>Chava</th></tr>");
		pw.println("<tr><th>SRK</th><th>Dipika</th><th>Om Shani Om</th></tr>");
		pw.println("<tr><th>SRK</th><th>Kajol</th><th>KKHH</th></tr>");
        pw.println("</table>");



		pw.close();

	}

}