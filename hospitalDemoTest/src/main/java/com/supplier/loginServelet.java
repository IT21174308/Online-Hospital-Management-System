package com.supplier;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/loginServelet")
public class loginServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
		
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		//hold un/pw from login.jsp page
		String SupplierId = request.getParameter("sid");
		String password = request.getParameter("pwd");
		
		
		boolean isTrue;
		
		isTrue = supplierDButil.validate(SupplierId, password);
		
		if (isTrue == true) {
			try {
				List<supplier> supdetails = supplierDButil.validate(SupplierId);
				request.setAttribute("supdetails", supdetails);
				}
				catch(Exception e){
					e.printStackTrace();
				}
			//redirect to another page
		RequestDispatcher dis = request.getRequestDispatcher("medicinelist.jsp");
		dis.forward(request, response);	
		}
		 else {
				out.println("<script type='text/javascript'>");
				out.println("alert('Your username or password is incorrect');");
				out.println("location='login.jsp'");
				out.println("</script>");
			}
		
	}

}
