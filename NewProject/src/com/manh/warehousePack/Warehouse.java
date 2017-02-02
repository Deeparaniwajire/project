package com.manh.warehousePack;

public class Warehouse {

	private int warehouseId;
	private String warehouseName;
	private String warehouseCity;
	public Warehouse(int warehouseId, String warehouseName, String warehouseCity) {
		super();
		this.warehouseId = warehouseId;
		this.warehouseName = warehouseName;
		this.warehouseCity = warehouseCity;
	}
	public int getWarehouseId() {
		return warehouseId;
	}
	public void setWarehouseId(int warehouseId) {
		this.warehouseId = warehouseId;
	}
	public String getWarehouseName() {
		return warehouseName;
	}
	public void setWarehouseName(String warehouseName) {
		this.warehouseName = warehouseName;
	}
	public String getWarehouseCity() {
		return warehouseCity;
	}
	public void setWarehouseCity(String warehouseCity) {
		this.warehouseCity = warehouseCity;
	}
	@Override
	public String toString() {
		return "Warehouse [warehouseId=" + warehouseId + ", warehouseName=" + warehouseName + ", warehouseCity="
				+ warehouseCity + "]";
	}
	
	
}
