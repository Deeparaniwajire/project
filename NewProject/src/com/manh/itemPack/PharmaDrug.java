package com.manh.itemPack;

import java.util.Date;

public class PharmaDrug extends Item {

	private String itemType;

	
	public PharmaDrug(String itemName, String itemCategory,
		int noOfUnits, double pricePerUnit, Date dateOfManufacture,
		Date dateOfExpiry, Date dateAdded, String itemLocation,
		String itemStatus, String itemType)
	    {
	super(itemName, itemCategory, noOfUnits, pricePerUnit, dateOfManufacture,
			dateOfExpiry, dateAdded, itemLocation, itemStatus);
	       this.itemType = itemType;
         }

	public String getItemType() {
		return itemType;
	}

	public void setItemType(String itemType) {
		this.itemType = itemType;
	}

	@Override
	public String toString() {
		return "PharmaDrug [itemType=" + itemType + ", itemCode=" + itemCode + ", itemName=" + itemName
				+ ", itemCategory=" + itemCategory + ", noOfUnits=" + noOfUnits + ", pricePerUnit=" + pricePerUnit
				+ ", dateOfManufacture=" + dateOfManufacture + ", dateOfExpiry=" + dateOfExpiry + ", dateAdded="
				+ dateAdded + ", beginningInventory=" + beginningInventory + ", quantityOnHand=" + quantityOnHand
				+ ", itemLocation=" + itemLocation + ", itemStatus=" + itemStatus + "]";
	}



	
			
}
