package com.bill.soft;

import java.util.Scanner;

public class Billing {
	public static void main(String[] args) {
		char method;

		System.out.println("Do you want to enter Inward or Outward ? I or O");
		Scanner scan = new Scanner(System.in);
		method = scan.next().charAt(0);
		

		while (method == 'o' || method == 'O') {
			Outward.outward();

		}
		Inwardbill.inward();
		scan.close();

	}

}
