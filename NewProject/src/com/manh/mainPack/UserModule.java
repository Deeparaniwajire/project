package com.manh.mainPack;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import com.manh.itemPack.Item;
import com.manh.itemPack.ItemInventoryProcessModule;
import com.manh.itemPack.*;
import com.manh.warehousePack.Warehouse;
import com.manh.warehousePack.WarehouseProcessModule;
import com.manh.warehousePack.Zone;

public class UserModule {
	public static void userModule()
	{
		Scanner sc = new Scanner(System.in);
		InputStreamReader r=new InputStreamReader(System.in);  
		BufferedReader br=new BufferedReader(r);  
   SimpleDateFormat df = new SimpleDateFormat("mm/dd/yyyy"); 
		try
		{
			while(true){
			
			System.out.println("1.  Add a new Warehouse Location ");
			System.out.println("2.  Search Warehouse Locations");
			System.out.println("3.  Search Items for a Location");
			System.out.println("4.  Delete a Warehouse Location");
			System.out.println("5.  Move Items to a Location");
			System.out.println("6.  Add item");
			System.out.println("7. Get All Items");
			System.out.println("8.  Search item");
			System.out.println("9.  Delete item");
			System.out.println("10.  Edit item");
			System.out.println("11.  Exit");
						
			System.out.println("Enter your choice*******");
			
		     int choice = sc.nextInt();
		     
		     switch(choice)
		     {
		     	case 1: Random rand = new Random();
		     			int whId=rand.nextInt(1)+1000;
		     			System.out.println("Enter warehouse location name");
		     			String whname=sc.next();
		     			System.out.println("Enter city");
		     			String city=sc.next();
		     		    Warehouse wh=new Warehouse(whId,whname,city);
		     		    String ch="y";
		     			while(ch.equals("y"))
		     			{
		     				System.out.println("Enter the zone alphabet");
		     				String zoneName=sc.next();
		     				
		     				System.out.println("Enter the no of aisles");
		     				int aisle=sc.nextInt();
		     				
		     				System.out.println("Enter the no of bays");
		     				int bay=sc.nextInt();
		     				
		     				System.out.println("Enter the no of levels");
		     				int level=sc.nextInt();
		     				
		     				System.out.println("Enter the value of bin");
		     				int bin=sc.nextInt();
		     				
		     				System.out.println("Enter the type of zone");
		     				String type=sc.next();
		     				
		     				Zone z=new Zone(zoneName,aisle, bay,level,bin,type);
		     				
		     				WarehouseProcessModule.InsertWarehouse(wh, z);
		     				
		     				System.out.println("Do you want add more zones,give 'y'");
		     				ch=sc.next(); 
		     				
			     		}
		     			break;
		     	case 2: break;
		     	case 3: break;
		     	case 4: break;
		     	case 5: break;
		     	case 6:  String  category =null;
		                       String type =null;
		     		    ch="y";
		     			while(ch.equals("y"))
		     			{
		     		    System.out.println("enter which category of item you want to add\n");
		     	        System.out.println("1 : MedicalSuppliesEquipment ");
		     	        System.out.println("2 : HealthAndPersonalCare ");
		     	        System.out.println("3 : BabyCare ");
		     	        System.out.println("4 : PharmaDrug ");
		     	        System.out.println("5 : Return to Main menu");
		     	        int choice1 = sc.nextInt();
		     	      
		     	         System.out.println("enter the item name");
		     	         String name =sc.next();
		     	     
		     	         System.out.println("enter the item number of units ");
		     	         int unit= sc.nextInt();

		     	         System.out.println("enter the price per unit");
		     	         double price =sc.nextInt();
		     	       
		     	        System.out.println("enter the date of manufacture");
		     	        String datestring = br.readLine();
		  		        Date dom = df.parse(datestring);
		  		        System.out.println("enter the date of expiry");
		     	         datestring = br.readLine();
			  		     Date doe = df.parse(datestring);
			  		     System.out.println("Enter the date of item adding");
			  		      datestring = br.readLine();
			  		      Date dateAdded = df.parse(datestring);
			  		      
			  		      System.out.println("enter the status of an item ,");
			  		      System.out.println("1 : absolute\n 2 : Available");
			  		       int i =sc.nextInt();
			  		       String status ;
			  		       if(i==1)
			  		       {
			  		    	   status ="absolute" ;
			  		       }
			  		       else
			  		       {
			  		    	   status = "Availabl" ;
			  		       }
			  		     System.out.println("enter the item location");
		     	         String location =sc.next();

			     	       if(choice1 == 1)
			     	         { 
			     	             category ="MedicalSuppliesEquipment" ;
			     	        	 System.out.println("Select the subcategory of an item \n");
			     	        	 System.out.println("1 :Tablet ");
			     	        	 System.out.println("2 : Capsule");     
			     	        	 System.out.println("3 : Syrup ");
			     	        	 // type =sc.next();
			     	        	 int ch1=sc.nextInt();
			     	        	 if(ch1==1)
			     	        	 {
			     	        		 type ="Tablet"; break;
			     	        	}
			     	        	 else if(ch1==2)
			     	        	 {
			     	        		 type = "Capsule" ; break;
			     	        	 }
			     	        	 else if(ch1==3)
			     	        	 {
			     	        		 type = "Syrup" ; break;
			     	        	 }
			     	        	 
			     	      Item medical = new MedicalSuppliesEquipment(name,category,unit,price,dom,doe,dateAdded,location,status,type);
				 	        ItemInventoryProcessModule.InsertItem(medical );
				 	        System.out.println("item code for the added item is "+medical.getItemCode());
			 		     	   }
		 	          
		     	         else
		     	         if(choice1 == 2)
		     	         {
		     	        	 category ="Health And Personal Care" ;     
		     	        	 System.out.println("Select The item type \n");
		     	        	System.out.println("1 : Cream and Lotion ");
		     	        	System.out.println("2 : Powders");   
		     	            System.out.println("3 : Hand and Foot Care ");
		     	        	System.out.println("4 : Sun Care ");
		     	            System.out.println("5 : Face Pack and Cleanser ");   
		     	           int ch1=sc.nextInt();
		     	        	 if(ch1==1)
		     	        	 {
		     	        		 type ="Cream and Lotion"; break;
		     	        	}
		     	        	 else if(ch1==2)
		     	        	 {
		     	        		 type = "Powders" ; break;
		     	        	 }
		     	        	 else if(ch1==3)
		     	        	 {
		     	        		 type = " Hand and Foot Care" ; break;
		     	        	 }
		     	        	 else if(ch1==4)
		     	        	 {
		     	        		 type = "Sun Care" ; break; 
		     	        	 }
		     	        	else if(ch1==5)
		     	        	 {
		     	        		 type = " Face Pack and Cleanser" ; break; 
		     	        	 }
		     	        	 Item  HealthAndPersonalCare = new HealthAndPersonalCare(name,category,unit,price,dom,doe,dateAdded,location,status ,type);
		     	        	ItemInventoryProcessModule.InsertItem(HealthAndPersonalCare);
		     	      	    System.out.println("item code for the added item is "+HealthAndPersonalCare.getItemCode());
		     	         }
		     	         else if(choice1 == 3) 
		     	        	
		     	         {
		     	        	 category ="Baby Care" ;
		     	        	 System.out.println("Select The item type \n");
			     	        	System.out.println("1  : Diaper and Wipe ");
			     	        	System.out.println("2  : Soap ");   
			     	            System.out.println("3  : Baby Powder  ");
			     	        	System.out.println("4  : Cereal and Formula Food Powder  ");
			     	        	 int ch1=sc.nextInt();
			     	        	 if(ch1==1)
			     	        	 {
			     	        		 type =" Diaper and Wipe"; break;
			     	        	}
			     	        	 else if(ch1==2)
			     	        	 {
			     	        		 type = "Soap" ; break;
			     	        	 }
			     	        	 else if(ch1==3)
			     	        	 {
			     	        		 type = "  Baby Powder" ; break;
			     	        	 }
			     	        	 else if(ch1==4)
			     	        	 {
			     	        		 type = "Cereal and Formula Food Powder" ; break; 
			     	        	 }
		     	        	 Item  babyCare = new BabyCare(name,category,unit,price,dom,doe,dateAdded,location,status,type);
		     	        	ItemInventoryProcessModule.InsertItem(babyCare );	
		     	           System.out.println("item code for the added item is "+babyCare.getItemCode());
		     	         }
		     	         else if(choice1 == 4) 
		     	         {
		     	        	 category ="Pharma Drug" ;
		     	        	 System.out.println("Select The item type \n");
			     	        	System.out.println("1  : Medical Monitor ");
			     	        	System.out.println("2  : Diagnostic  ");   
			     	            System.out.println("3  : Surgical Instrument   ");
			     	           int ch1=sc.nextInt();
			     	        	 if(ch1==1)
			     	        	 {
			     	        		 type =" Medical Monitor"; break;
			     	        	}
			     	        	 else if(ch1==2)
			     	        	 {
			     	        		 type = "Diagnostic" ; break;
			     	        	 }
			     	        	 else if(ch1==3)
			     	        	 {
			     	        		 type = " Surgical Instrument " ; break;
			     	        	 }
		     	        	 Item  pharmaDrug = new  PharmaDrug(name,category,unit,price,dom,doe,dateAdded,location,status,type);
		     	        	ItemInventoryProcessModule.InsertItem(pharmaDrug);
			     	           System.out.println("item code for the added item is "+pharmaDrug.getItemCode());
			     	       }
		     	         else
		     	        	 if(choice1 == 5)
		     	        	 {
		     	        		UserModule.userModule() ;
		     	        	 }
		     	         System.out.println("Item added successfully \n");
		     	        
		     	         System.out.println("Do you want to add one more item ? press 'y' if Yes, else press any other key");
		     	         ch =sc.next();
		     			}
		     	        break;
		     	        
		     	case 7: ArrayList<Item> itemList = ItemInventoryProcessModule.getAllItems();
		     			if(itemList.isEmpty())
		     			{
		     				System.out.println("No items present currently\n");
		     			}
		     			else
		     			{ 
		     				System.out.println("The List of Items ");
		     			    System.out.println("************************");
		     				for(Item item : itemList)
		     				{
		     					System.out.println(item);
		     				}
		     				System.out.println("*********************");
		     			}
		     			break;
		     	case 8: System.out.println("Enter the item code to search the item");
		     	        int itemCode =sc.nextInt();
		     	        Item item = ItemInventoryProcessModule.getAItem(itemCode);
		     	        System.out.println(item);
		     		   break;
		     		   
		     	case 9: System.out.println("Enter the item code to delete  the item");
		     	        itemCode = sc.nextInt();
		     	        if(ItemInventoryProcessModule.deleteAItem(itemCode))
		     	        {
		     	        System.out.println("the item with code "+ itemCode+ " is deleted from the warehouse");	
		     	        }
		     	        else
		     	        {
		     	        	System.out.println("item not found");
		     	        }
		     	        break;
		     	        
		     	case 10:System.out.println("enter the item code of the item to edit \n"); 
		     	       int code =sc.nextInt();
		     	       System.out.println("slect what you want to edit");
		     	       System.out.println("1 : Item category");
		     	       System.out.println("2 : Item Name");
		     	       System.out.println("3 : Item sub category");
		     	       System.out.println("4 : biggining inventory");
		     	       System.out.println("5 : quantity on han");
		     	       System.out.println("6 : price per unit");
		     	       System.out.println("7 : date of manufacture ");
		     	       System.out.println("8 :  date of expiry");
		     	        choice = sc.nextInt();
		     	        switch(choice)
		     	        {
		     	        case 1 : System.out.println("enter the ");
		     	                  break;
			     	    case 2 :System.out.println("Enter the new name");
			     	            String   name=sc.next();
			     	              ItemInventoryProcessModule.editItemName(code ,name);
			     	              System.out.println("Details got updated");
			     	               break;
			     	    case 3 :break;
			     	    case 4 :System.out.println("enter the new biggining enventory");
			     	             int value =sc.nextInt();
			     	                ItemInventoryProcessModule.editBeggningInventory(code, value);
			     	               System.out.println("Details got updated");
			     	    break;
			     	    case 5 :
			     	    	    System.out.println("enter the new quantity on hand");
	     	                     value =sc.nextInt();
	     	                      ItemInventoryProcessModule.editQuantityOnHand(code, value);
	     	                     System.out.println("Details got updated");
	     	                     break;
			     	    case 6 :System.out.println("enter the new price per unit");
	     	                     value =sc.nextInt();
	     	                     ItemInventoryProcessModule.editItemPrice(code, value);
	     	                    System.out.println("Details got updated");
	     	                    break;
			     	    case 7 :System.out.println("enter the new date of manufacture");
			     	          String  datestring = br.readLine();
			  		            Date date = df.parse(datestring);
	     	                   ItemInventoryProcessModule.editItemDom(code, date);
	     	                  System.out.println("Details got updated");
			     	    	break;
			     	   case 8 :System.out.println("enter the new date of manufacture");
	     	                    datestring = br.readLine();
	  		                     date = df.parse(datestring);
 	                           ItemInventoryProcessModule.editItemDoe(code, date);
 	                          System.out.println("Details got updated");
 	                           break;
 	                     }
		     	       
		     	      
		     	       break;
		     	case 11: break;
		     	}
		     		 
			
	     			
		     	
		     			
			}
			
		} catch (IOException e) {
			
			e.printStackTrace();
		} catch (ParseException e1) {
			
			e1.printStackTrace();
		}finally
		{
			sc.close();
		}
}
	}
	