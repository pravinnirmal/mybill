package com.bill.soft;

public class Inward {
	private int ids;
	private String itemName;
	private int nos;

	Inward(int ids, String itemName, int nos) {
		this.ids=ids;
		this.itemName = itemName;
		this.nos = nos;
	}
	
	static void inwardFormat() {
		System.out.println("Ids   Item         Nos");
	}
	
	void inwardDisplay() {
		System.out.format("\n %-3o  %-10s   %-3o \n",ids,  itemName, nos);
	}

}
