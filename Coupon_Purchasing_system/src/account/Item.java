package Coupon_Purchasing_System;

public class Item {
	private String itemName;

	private double itemPrice;
	private int itemID;
	private String itemDescription;
	
	public Item(String itemName, double itemPrice, int itemID, String itemDescription) {
		this.itemName = itemName;
		this.itemPrice = itemPrice;
		this.itemID = itemID;
		this.itemDescription = itemDescription;
	}
	
	public String getItemName() {
		return itemName;
	}
	
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	
	public double getItemPrice() {
		return itemPrice;
	}
	
	public void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	}
	
	public int getItemID() {
		return itemID;
	}
	
	public void setItemID(int itemID) {
		this.itemID = itemID;
	}
	
	public String getItemDescription() {
		return itemDescription;
	}
	
	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}
	
	
}
