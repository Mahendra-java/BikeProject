package com.app;

public class Bike {
	
	private int gear;
	
	public void setGear(int gear) {
		if(gear>5) {
			System.out.println("gear not available... \nEnter gear no b/w 1-5");
		}else if (gear<=0) {
			System.out.println("Not a valid gear Enter gear no. b/w 1-5");
		}else if (gear==0) {
			System.out.println("Your bike is in neutral");
		}else
		this.gear=gear;
	}
	
	public int getGear() {
		return gear;
	}

}
