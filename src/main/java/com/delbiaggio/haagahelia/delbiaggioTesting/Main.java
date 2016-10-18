package com.delbiaggio.haagahelia.delbiaggioTesting;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Main
 */
@WebServlet("/Main")
public class Main extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Main() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.getWriter().println("<br/>");
		response.getWriter().println("System Date = " + new SystemTimeSource().getTimeMoment());
		response.getWriter().println("<br/>");
		response.getWriter().println("Internet Date = " + new InternetTimeSource().getTimeMoment());	
		
		PrintWriter out = response.getWriter();
		String html = "<meta http-equiv= \"refresh\" content= \"1\" />";
	    out.write(html);
	    response.getWriter().println("<br/>");
	    response.getWriter().println("Today date is "+new FinnishWatch().getDate());
	    response.getWriter().println("<br/>");
	    response.getWriter().println("Time is "+new FinnishWatch().getTime());
	    
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
