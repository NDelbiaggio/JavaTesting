package com.delbiaggio.haagahelia.delbiaggioTesting;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

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
		PrintWriter out = response.getWriter();
		String html = "<meta http-equiv= \"refresh\" content= \"5\" />";
	    out.write(html);
	    
		response.getWriter().append("Served at: ").append(request.getContextPath());
		ArrayList<Watch> lstWatches = getWatches();
		showTimes(lstWatches,response);
	}
	/**
         * Makes an instant of all the different timesources, and places them in a arraylist.
         * @return 
         */
	private ArrayList<Watch> getWatches(){
	    ArrayList<Watch> lstWatches = new ArrayList<Watch>();
	    TimeSource time = new SystemTimeSource();
	    Watch w = new FinnishWatch(time);
	    lstWatches.add(w);
	    time = new InternetTimeSource();
	    w = new FinnishWatch(time);
	    lstWatches.add(w);
	    time = new MockTimeSource();
	    w = new FinnishWatch(time);
	    lstWatches.add(w);
	    return lstWatches;
	}
	/**
         * Shows the time for the different kinds of timesources for each watch.
         * @param lstWatches
         * @param response
         * @throws IOException 
         */
	private void showTimes(ArrayList<Watch> lstWatches,HttpServletResponse response) throws IOException{
		for (Watch w:lstWatches) {
			response.getWriter().println("<br/>");
			response.getWriter().println("<h1> "+ w.getSource()+"</h1>" );
			response.getWriter().println("<h1>Today date is "+w.getDate()+"</h1>");
			response.getWriter().println("<h2>Time is "+w.getTime()+"</h2>");
			response.getWriter().println("<h2>The Time in GMT+0 Summer Time is "+ w.getTimeInTimeZoneX(EnumarrationTimeZones.SPone)+"</h2>");
			response.getWriter().println("<h2>The day in French "+w.getDay()+"</h2>");
			response.getWriter().println("<h2>The day in Finnish "+w.getDay(Languages.Finnish)+"</h2>");
			response.getWriter().println("<h2>The day in German "+w.getDay(Languages.German)+"</h2>");
			response.getWriter().println("<h2>The day in English "+w.getDay(Languages.English)+"</h2>");
			response.getWriter().println("<br/>");
			
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
