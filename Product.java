package com.bill.soft;

public class Product {
	private String pName;
	private int quantity;
	private double cost;
	private double sCost;
	private int count;
	

	Product(int count, String pName, int quantity, double cost, double sCost) {
		this.pName = pName;
		this.quantity = quantity;
		this.cost = cost;
		this.sCost = sCost;
		this.count = count;

	}

	

	static void productFormat() {
		System.out.println("Id    Name          Quantity   Cost     S.Cost");
	}

	void ProductDisplay() {
		System.out.format("\n %-3s %-10s %10s %10.2f %10.2f \n", count, pName, quantity, cost, sCost);

	}

	
}
