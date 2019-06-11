package com.app;

import java.util.Scanner;

public class Gear {
	public static void main(String[] args) {
		
		for (int i = 0; i <= 10 ; i++) {
		Scanner scn1 = new Scanner(System.in);
		Bike b1 = new Bike();
		System.out.println("Enter gear no. :");
		b1.setGear(scn1.nextInt());
		System.out.println("\nYou are on gear: "+b1.getGear());
		System.out.println("=========");
		}
		/*Bike b2 = new Bike();
		System.out.println("Enter gear no. :");
		b2.setGear(scn1.nextInt());
		System.out.println("\nYou are on gear: "+b2.getGear());*/
	}

}
