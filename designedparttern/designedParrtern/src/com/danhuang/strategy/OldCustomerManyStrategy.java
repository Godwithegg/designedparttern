package com.danhuang.strategy;

public class OldCustomerManyStrategy implements Strategy{

	@Override
	public double getPrice(double standarPrice) {
		System.out.println("老客户大批量，打八折");
		return standarPrice*0.8;
	}
	
}
