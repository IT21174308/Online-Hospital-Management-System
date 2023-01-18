package com.supplier;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/deleteServlet")
public class deleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("mid");
	
		
		boolean isTrue;
		
		isTrue = supplierDButil.deletemedicine(id);
		
		if (isTrue == true ) {
			List<supplier> supdetails = supplierDButil.getCustomerDetails(id);
			request.setAttribute("supdetails", supdetails);
				//redirect to another page
			RequestDispatcher dis = request.getRequestDispatcher("medicinelist.jsp");
			dis.forward(request, response);	
			
		}
		else {
			
			
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("medicinelist.jsp");
			dispatcher.forward(request, response);
		}

	}

}
