package com.supplier;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class supplierDButil {
	
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
	private static boolean isSuccess;

	
	
	//validation
public static boolean validate(String SupplierId, String password) {
		
		try {
			con = dbconnect.getConnection();
			stmt = con.createStatement();
			String sql = "select * from supplier where SupplierId='"+SupplierId+"' and Password='"+password+"'";
			rs = stmt.executeQuery(sql);
			
			if (rs.next()) {
				isSuccess = true;
			} else {
				isSuccess = false;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return isSuccess;
	}

//read
public static List<supplier> validate(String SupplierId){//method to validate
	ArrayList<supplier> sup = new ArrayList<>();
	
	//validate
	try {
		//connection
		con = dbconnect.getConnection();
		stmt = con.createStatement();
		String sql ="select *from medicine where SupplierId='"+SupplierId+"'";
		rs=stmt.executeQuery(sql);
		
		//fetch user details
		while(rs.next()) {
			String id=rs.getString(1);
			String name = rs.getString(2);
			String description = rs.getString(3);
			String quantity = rs.getString(4);
			String supplierId =rs.getString(5);
			
			supplier s = new supplier(id, name,description,quantity,supplierId);
			sup.add(s);
		}
	}
	catch (Exception e) {
	e.printStackTrace();
	}
	return sup;
}

//insert
public static boolean insertmedicine(String id ,String name, String description, String quantity,String SupplierId) {
	boolean isSuccess = false;
	
	//create db connection
	try {
		con= dbconnect.getConnection();
		stmt = con.createStatement();
		String sql ="insert into medicine values('"+id+"','"+name+"','"+description+"','"+quantity+"','"+SupplierId+"')";
		int r=stmt.executeUpdate(sql);
		
		if(r > 0) {
			isSuccess=true;
		}else {
			isSuccess= false;
		}
	
	} 
	catch (Exception e) {
		e.printStackTrace();
	}
	
	
	return isSuccess;	
	
}


//update


public static List<supplier> getCustomerDetails1(String SupplierId) {
	ArrayList<supplier> sup = new ArrayList<>();
	
	try {
		
		con = dbconnect.getConnection();
		stmt = con.createStatement();
		String sql = "select * from medicine where medicine_id='"+SupplierId+"'";
		rs = stmt.executeQuery(sql);
		
		while(rs.next()) {
			String id=rs.getString(1);
			String name = rs.getString(2);
			String description = rs.getString(3);
			String quantity = rs.getString(4);
			String supplierId =rs.getString(5);
			
			supplier s = new supplier(id, name, quantity,description,supplierId);
			sup.add(s);
		}
		
	}
	catch(Exception e) {
		e.printStackTrace();
	}	
	return sup;	
}

public static boolean updatemedicine(String id, String name, String description, String quantity,String SupplierId) {
	
	try {
		
		con = dbconnect.getConnection();
		stmt = con.createStatement();
		String sql = "update medicine set medicine_id='"+id+"', medicine_name='"+name+"',medicine_description='"+description+"',medicine_quantity='"+quantity+"' where SupplierId='"+id+"'";
		int rs = stmt.executeUpdate(sql);
		
		if(rs > 0) {
			isSuccess = true;
		}
		else {
			isSuccess = false;
		}
		
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	
	return isSuccess;
}



//delete

public static List<supplier> getCustomerDetails(String Id) {
	ArrayList<supplier> sup = new ArrayList<>();
	
	try {
		
		con = dbconnect.getConnection();
		stmt = con.createStatement();
		String sql = "select * from medicine where medicine_id='"+Id+"'";
		rs = stmt.executeQuery(sql);
		
		while(rs.next()) {
			String id=rs.getString(1);
			String name = rs.getString(2);
			String descrition = rs.getString(3);
			String quantity = rs.getString(4);
			String supplierId = rs.getString(5);
			
			supplier s = new supplier(id, name, quantity,descrition,supplierId);
			sup.add(s);
		}
		
	}
	catch(Exception e) {
		e.printStackTrace();
	}	
	return sup;	
}


public static boolean deletemedicine(String id) {
	
	try {
		
		con = dbconnect.getConnection();
		stmt = con.createStatement();
		String sql = "delete from medicine where medicine_id='"+id+"'";
		int r = stmt.executeUpdate(sql);
		
		if (r > 0) {
			isSuccess = true;
		}
		else {
			isSuccess = false;
		}
		
	}
	catch (Exception e) {
		e.printStackTrace();
	}
	
	return isSuccess;
}
public static boolean valid(String SupplierId) {
	
	try {
		con = dbconnect.getConnection();
		stmt = con.createStatement();
		String sql = "select * from supplier where SupplierId='"+SupplierId+"'";
		rs = stmt.executeQuery(sql);
		
		if (rs.next()) {
			isSuccess = true;
		} else {
			isSuccess = false;
		}
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	
	return isSuccess;
}
	
}