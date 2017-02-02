package com.manh.itemPack;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

public class ItemInventoryProcessModule 
{
 
	private static ArrayList<Item> itemList=new ArrayList<Item>();
	
	public static void InsertItem(Item t)
		
	{ 
		
		  itemList.add(t);
		                                            
	}
	/* if(itemList.isEmpty())
	      {
	    	itemList.add(t);  
	      }
		 else
		 {
			 
 
			if(t instanceof MedicalSuppliesEquipment)
	        	{
			       MedicalSuppliesEquipment ms = (MedicalSuppliesEquipment)t ;
			       for(Iterator<Item> itr = itemList.iterator(); itr.hasNext();)
			       {
			    	   
			    	  Item item= itr.next(); 
			    	 
			    	  if(item instanceof MedicalSuppliesEquipment )
			    	  {
			    		  MedicalSuppliesEquipment ms1 = (MedicalSuppliesEquipment)item ; 
			    		  
			    		  if(ms1.getItemType().equals(ms.getItemType()))
			    		   {
			    			  ms.setItemCode(ms1.getItemCode());
			    			
			    			  itemList.add(ms);
			    			  
			    			  System.out.println(itemList);
			    		   }
			    		   else
			    		   {
			    			   itemList.add(ms);
			    			   System.out.println(itemList);
			    		   }
			    	 
			    		   
			    	  }
			    	  else
			    	  {
			    		  itemList.add(ms) ;
			    			 System.out.println(itemList);  
			    	  }
			       }
			       }
	
        	}
		 }
	
		
	
		 for(Item item :itemList)
		 { 
		 }
	   ;*/
	public static int getBeginningInventory1(int noOfUnits,String item ) {
		int beginningInventory=0 ;
		
		ArrayList<Item> itemList = ItemInventoryProcessModule .getAllItems();
		if(itemList.isEmpty())
		{
			beginningInventory =noOfUnits ;
		}
		else
		{
					for(Item t:itemList)
			{
			   if(t.getItemName().equals(item))	
			   {
				   beginningInventory = t.getBeginningInventory() ; 
			   }
			   else
			   {
				  beginningInventory = noOfUnits ;
			   }
			}
		}
		return beginningInventory ;
	}

	public static  int getQuantityOnHand1(	int noOfUnits ,String itemName) {
		
		int quantityOnHand =0;
		ArrayList<Item> itemList = ItemInventoryProcessModule .getAllItems();
		if(itemList.isEmpty())
		{
   		quantityOnHand = noOfUnits ;
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
		}
		return quantityOnHand;
	}

  
	public static Item getAItem(int itemCode)
	{
		for (Item item :itemList)
		{
			if(item.getItemCode()== itemCode)
			{
				return item;
			}
		}
		 
return null;
		  
	}

	public static boolean deleteAItem(int itemCode)
	{ 
		Item item= getAItem(itemCode);
		 if(itemList.remove(item))
		 {
			 return true;
		 }
		 return false;
	}
	
	public static ArrayList<Item > getAllItems()
	{
		return itemList ;
	}
/*	public static void editItem(int itemCode ,Item t)
	{
		Item item = getAItem(itemCode);
		item.setItemName(t.getItemName());
		item.setItemStatus(t.getItemStatus());
		item.setBeginningInventory(t.getBeginningInventory());
		item.setQuantityOnHand(t.getQuantityOnHand());
		item.setDateOfManufacture(t.getDateOfManufacture());
		item.setDateOfExpiry(t.getDateOfExpiry());
		item.setPricePerUnit(t.getPricePerUnit());
		item.setItemCategory(t.getItemCategory());
          
		
	}*/
	public static void editItemName(int itemCode ,String name)
	{
		Item item = getAItem(itemCode);
		item.setItemName(name);
	}
	public static void editItemCategory(int itemCode ,String name)
	{
		Item item = getAItem(itemCode);
		item.setItemCategory(name);
	}
	/*public static void editItemSubCategory(int itemCode ,String name)
	{
		Item item = getAItem(itemCode);
		i
	}*/
	public static void editBeggningInventory(int itemCode ,int value)
	{
		Item item = getAItem(itemCode);
		item.setBeginningInventory(value);
	}
	public static void editQuantityOnHand(int itemCode ,int value)
	{
		Item item = getAItem(itemCode);
		item.setQuantityOnHand(value);
	}
	public static void editItemPrice(int itemCode ,int value)
	{
		Item item = getAItem(itemCode);
		item.setPricePerUnit(value);
	}
	/*public static void editItemUnit(int itemCode ,String name)
	{
		Item item = getAItem(itemCode);
		item.setItemName(name);
	}*/
	public static void editItemDom(int itemCode ,Date date)
	{
		Item item = getAItem(itemCode);
		item.setDateOfManufacture(date);
	}
	public static void editItemDoe(int itemCode ,Date date)
	{
		Item item = getAItem(itemCode);
		item.setDateOfExpiry(date);
	}
}
