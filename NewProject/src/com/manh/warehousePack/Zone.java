package com.manh.warehousePack;

public class Zone {

	private String zoneAlphabet;
	private int aisle;
	private int bay;
	private int level;
	private int bin;
	private String typeOfZone;
	public String getZoneAlphabet() {
		return zoneAlphabet;
	}
	public void setZoneAlphabet(String zoneAlphabet) {
		this.zoneAlphabet = zoneAlphabet;
	}
	public int getAisle() {
		return aisle;
	}
	public void setAisle(int aisle) {
		this.aisle = aisle;
	}
	public int getBay() {
		return bay;
	}
	public void setBay(int bay) {
		this.bay = bay;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public int getBin() {
		return bin;
	}
	public void setBin(int bin) {
		this.bin = bin;
	}
	public String getTypeOfZone() {
		return typeOfZone;
	}
	public void setTypeOfZone(String typeOfZone) {
		this.typeOfZone = typeOfZone;
	}
	public Zone(String zoneAlphabet, int aisle, int bay, int level, int bin, String typeOfZone) {
		super();
		this.zoneAlphabet = zoneAlphabet;
		this.aisle = aisle;
		this.bay = bay;
		this.level = level;
		this.bin = bin;
		this.typeOfZone = typeOfZone;
	}
	@Override
	public String toString() {
		return "Zone [zoneAlphabet=" + zoneAlphabet + ", aisle=" + aisle + ", bay=" + bay + ", level=" + level
				+ ", bin=" + bin + ", typeOfZone=" + typeOfZone + "]";
	}
	
	
}
