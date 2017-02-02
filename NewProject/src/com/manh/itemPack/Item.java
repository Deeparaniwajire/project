package com.manh.itemPack;

import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

public class Item {

	protected int itemCode;
	protected String itemName;
	protected String itemCategory;
	protected int noOfUnits ;
	protected double pricePerUnit;
	protected Date dateOfManufacture;
	protected Date dateOfExpiry;
	protected Date dateAdded;
	protected int beginningInventory;
	protected int quantityOnHand;
	protected String itemLocation;
	protected String itemStatus;


	private static int idGenerator()
	{
		Random r = new Random();
		return (r.nextInt(5000)+1000);
	}
	

	public Item( String itemName, String itemCategory ,int noOfUnits , double pricePerUnit, Date dateOfManufacture, Date dateOfExpiry,
			Date dateAdded, String itemLocation, String itemStatus) {
		super();
		this.itemCode = idGenerator();
		this.itemName = itemName;
		this.itemCategory = itemCategory;
		this.noOfUnits =noOfUnits ;
		this.pricePerUnit = pricePerUnit;
		this.dateOfManufacture = dateOfManufacture;
		this.dateOfExpiry = dateOfExpiry;
		this.dateAdded = dateAdded ;
		this.beginningInventory = ItemInventoryProcessModule .getBeginningInventory1(noOfUnits,itemName) ;
		this.quantityOnHand = ItemInventoryProcessModule.getQuantityOnHand1(noOfUnits,itemName);
		this.itemLocation = itemLocation;
		this.itemStatus = itemStatus;
		
	}

	public int getItemCode() {
		return itemCode;
	}

	public void setItemCode(int itemCode) {
		this.itemCode = itemCode;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public double getPricePerUnit() {
		return pricePerUnit;
	}

	public void setPricePerUnit(double pricePerUnit) {
		this.pricePerUnit = pricePerUnit;
	}

	public Date getDateOfManufacture() {
		return dateOfManufacture;
	}

	public void setDateOfManufacture(Date dateOfManufacture) {
		this.dateOfManufacture = dateOfManufacture;
	}

	public Date getDateOfExpiry() {
		return dateOfExpiry;
	}

	public void setDateOfExpiry(Date dateOfExpiry) {
		this.dateOfExpiry = dateOfExpiry;
	}



	public void setBeginningInventory(int beginningInventory) {
		this.beginningInventory =  beginningInventory ;
	}
	
	
public int getBeginningInventory() {
	/*ArrayList<Item> itemList = ItemInventoryProcessModule .getAllItems();
	if(itemList.isEmpty())
	{
		beginningInventory =noOfUnits ;
	}
	else
	{
				for(Item t:itemList)
		{
		   if(t.getItemName().equals(itemName))	
		   {
			   this.beginningInventory = t.getBeginningInventory() ; 
		   }
		   else
		   {
			   this.beginningInventory = noOfUnits ;
		   }
		}
	}*/
	return this.beginningInventory ;
}

	public void setQuantityOnHand(int quantityOnHand) {
		this.quantityOnHand = quantityOnHand ;
	}
	
	public int getQuantityOnHand() {
	
	/*	ArrayList<Item> itemList = ItemInventoryProcessModule .getAllItems();
		if(itemList.isEmpty())
		{
			this.quantityOnHand = noOfUnits ;
		}
		else
		{
			
			for(Item t:itemList)
			{
			   if(t.getItemName().equals(itemName))	
			   {
				   quantityOnHand = t.getQuantityOnHand()+noOfUnits ; 
			   }
			   else
			   {
				   quantityOnHand = noOfUnits ;
			   }
			}
		}*/
		return quantityOnHand;
	}
	public String getItemLocation() {
		return itemLocation;
	}

	public void setItemLocation(String itemLocation) {
		this.itemLocation = itemLocation;
	}

	public String getItemStatus() {
		return itemStatus;
	}

	public void setItemStatus(String itemStatus) {
		this.itemStatus = itemStatus;
	}

	public String getItemCategory() {
		return itemCategory;
	}

	public void setItemCategory(String itemCategory) {
		this.itemCategory = itemCategory;
	}
	
}
