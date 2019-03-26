package com.danhuang.decorator;

/**
 * 具体构件对象
 * @author danhuang
 *
 */
public class Car implements ICar{
	
	@Override
	public void move() {
		System.out.println("陆地上跑");
	}
}
