package com.danhuang.strategy;

public class NewCustomerFewStrategy implements Strategy{

	@Override
	public double getPrice(double standarPrice) {
		System.out.println("��ͨ�û�С���������ۣ�ԭ��");
		return standarPrice;
	}
	
}
