package com.generics;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Maximum max = new Maximum();
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter First Number: ");
		float first = scan.nextFloat();
		System.out.println("Enter First Value: ");
		String first1 = scan.next();

		System.out.println("Enter Second Number: ");
		float second = scan.nextFloat();
		System.out.println("Enter Second Value: ");
		String second1 = scan.next();

		System.out.println("Enter Third Number: ");
		float third = scan.nextFloat();
		System.out.println("Enter Third Value: ");
		String third1 = scan.next();

		max.maxFloat(first1, second1, third1);
		max.maxString(first1, second1, third1);
	}
}
