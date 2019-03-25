package com.danhuang.factory.abstractfactory;

/**
 * 低端座椅
 * @author danhuang
 *
 */
public class LowSeat implements Seat{

	@Override
	public void massage() {
		System.out.println("不能自动按摩");
	}
	
}
