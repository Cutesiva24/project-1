package com.controller.ornament;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.controller.ornamentDao.OrnamentDao;
import com.controller.ornamentbe.OrnamentBean;



@WebServlet("/OrnamentSer")
public class OrnamentSer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException 
	{  
		 
        PrintWriter out = response.getWriter();
		String type = request.getParameter("type");
		String brand = request.getParameter("brand");
	     int cost = Integer.parseInt(request.getParameter("cost"));
	     int ratings =Integer.parseInt(request.getParameter("ratings"));
		 OrnamentBean o = new OrnamentBean(type,brand,cost,ratings);
		 int count = OrnamentDao.insert(o);
		 if(count>0)
		 {
			 out.println("<h1> sucessfully inserted<h1>");
		 }
		 else
		 {
			 out.println("<h1>data is not inserted<h1>");
		 }
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
