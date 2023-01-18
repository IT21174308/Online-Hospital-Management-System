package com.supplier;

public class supplier {
	private  String medicine_id;
	private  String medicine_name;
	private  String medicine_description;
	private  String medicine_quantity;
	private  String SupplierId;


	public supplier(String id, String name, String quantity, String descrition,String supplierId) {
		this.medicine_id = id;
		this.medicine_name=name;
		this.medicine_description=descrition;
		this.medicine_quantity = quantity;
		this.SupplierId = supplierId;
}
	public supplier() {
		
	}


	public String getMedicine_id() {
		return medicine_id;
	}


	public String getMedicine_name() {
		return medicine_name;
	}


	public String getMedicine_description() {
		return medicine_description;
	}


	public String getMedicine_quantity() {
		return medicine_quantity;
	}


	public String getSupplierId() {
		return SupplierId;
	}


	public void setMedicine_id(String medicine_id) {
		this.medicine_id = medicine_id;
	}


	public void setMedicine_name(String medicine_name) {
		this.medicine_name = medicine_name;
	}


	public void setMedicine_description(String medicine_description) {
		this.medicine_description = medicine_description;
	}


	public void setMedicine_quantity(String medicine_quantity) {
		this.medicine_quantity = medicine_quantity;
	}


	public void setSupplierId(String supplierId) {
		SupplierId = supplierId;
	}

}