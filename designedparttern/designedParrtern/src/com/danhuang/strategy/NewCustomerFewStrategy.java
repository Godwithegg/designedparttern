package com.danhuang.strategy;

public class NewCustomerFewStrategy implements Strategy{

	@Override
	public double getPrice(double standarPrice) {
		System.out.println("普通用户小批量不打折，原价");
		return standarPrice;
	}
	
}
