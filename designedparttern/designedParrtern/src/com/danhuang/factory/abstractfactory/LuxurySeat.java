package com.danhuang.factory.abstractfactory;

/**
 * 高端座椅
 * @author danhuang
 *
 */
public class LuxurySeat implements Seat{

	@Override
	public void massage() {
		System.out.println("可以自动按摩");
	}
	
}
