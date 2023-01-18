package com.supplier;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/updteServelet")
public class updteServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("medicine_id");
		String name = request.getParameter("medicine_name");
		String description = request.getParameter("medicine_description");
		String quantity = request.getParameter("medicine_quantity");
		String SupplierId = request.getParameter("SupplierId");
		
		
		boolean isTrue;
		
		isTrue = supplierDButil.updatemedicine(id, name, description, quantity,SupplierId);
		
		if(isTrue == true) {
			
			List<supplier> supdetails = supplierDButil.getCustomerDetails(SupplierId);
			request.setAttribute("supdetails", supdetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("medicinelist.jsp");
			dis.forward(request, response);
		}
		else {
			List<supplier> supdetails = supplierDButil.getCustomerDetails(id);
			request.setAttribute("supdetails", supdetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("medicinelist.jsp");
			dis.forward(request, response);
		}
	}

	}