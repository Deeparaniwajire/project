package com.manh.warehousePack;
import java.util.ArrayList;
import java.util.HashMap;


public class WarehouseProcessModule {
private static HashMap<Warehouse,Zone> whlist=new HashMap<Warehouse,Zone>();
	
	public static void InsertWarehouse(Warehouse p,Zone z)
	{
	     whlist.put(p,z);
	}
	public static HashMap<Warehouse,Zone> displayWarehouse()
	{
		return whlist;
	}

	
}
