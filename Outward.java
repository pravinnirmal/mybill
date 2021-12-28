package com.bill.soft;

import java.util.ArrayList;
import java.util.Scanner;

public class Outward {
	static void outward() {
		String pName = null;
		int quantity = 0;
		double cost = 0.0;
		double sCost = 0.0;
		int count = 001;
		double total = 0;

		char choice = '\0';

		Scanner scano = new Scanner(System.in);

		ArrayList<Product> plist = new ArrayList<Product>();

		do {

			System.out.println("Enter Details");
			System.out.println("Enter Product Name:");
			pName = scano.next();
			System.out.println("Enter Quantity:");
			quantity = scano.nextInt();
			System.out.println("Enter Cost:");

			cost = scano.nextDouble();
			System.out.println("Enter Selling Price");
			sCost = scano.nextDouble();

			total += quantity;

			plist.add(new Product(count, pName, quantity, cost, sCost));

			System.out.println("Do you want to add more? Y or N");

			choice = scano.next().charAt(0);
			count++;
			

		}

		while (choice == 'y' || choice == 'Y');
		Product.productFormat();
		for (Product v : plist) { // for each item printing in array colon is used
			v.ProductDisplay();

		}
		System.out.println("");
		System.out.println("The total stock  is " + total);

		scano.close();
		System.exit(0);   // comment this line

	}

}
