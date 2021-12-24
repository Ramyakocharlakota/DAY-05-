package com.quorem;

import java.util.Scanner;

public class QuoRem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Dividend :");
		int dividend = sc.nextInt();
		System.out.println("Enter the Divisor :");
		int divisor = sc.nextInt();
		sc.close();
		int Quot = dividend/divisor;
		int Remain = dividend%divisor;
		System.out.println("Quotient : " + Quot);
		System.out.println("Remainder : " + Remain);		// TODO Auto-generated method stub

	}

}
