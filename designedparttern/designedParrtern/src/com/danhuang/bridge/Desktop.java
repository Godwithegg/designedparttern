package com.danhuang.bridge;

/**
 * 机型：台式机
 * @author danhuang
 *
 */
public class Desktop extends Computer{
	
	public Desktop(Brand brand) {
		super(brand);
	}
	
	@Override
	public void sale() {
		super.sale();
		System.out.println("销售台式机");
	}
}
