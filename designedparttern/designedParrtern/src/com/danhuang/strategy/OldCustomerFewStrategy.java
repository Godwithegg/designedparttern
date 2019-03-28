package com.danhuang.strategy;

public class OldCustomerFewStrategy implements Strategy{

	@Override
	public double getPrice(double standarPrice) {
		System.out.println("老客户小批量，打八五折");
		return standarPrice*0.85;
	}
	
}
