package com.bill.soft;

import java.util.ArrayList;

import java.util.Scanner;

public class Inwardbill {

	static void inward() {

		String itemName = null;
		int ids =01;
		int nos = 0;
		char addm;

		Scanner scani = new Scanner(System.in);
		ArrayList<Inward> into = new ArrayList<Inward>();

		do {

			System.out.println("Enter Items");
			itemName=scani.next();
			System.out.println("Enter item count");
			nos = scani.nextInt();
			into.add(new Inward(ids, itemName, nos));
			
			System.out.println("Do you want to add more? Y or N");
			addm = scani.next().charAt(0);
			ids++;

		} while (addm == 'y' || addm == 'Y');
		Inward.inwardFormat();

		for (Inward s : into) {
			s.inwardDisplay();
		}

		scani.close();
	}
}
