package com.lti.servlets;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Product;

/**
 * Servlet implementation class AddRecords
 */
public class AddRecords extends HttpServlet {
	private static final long serialVersionUID = 1L;
       public Product product;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddRecords() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id=request.getParameter("prodid");
		int prodid=Integer.parseInt(id);
		String prodname=request.getParameter("prodname");
		String r=request.getParameter("rate");
		int rate=Integer.parseInt(r);
		product=new Product(prodid,prodname,rate);
		request.setAttribute("records", product);		
		request.getRequestDispatcher("RecordsDisplay.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
