package com.danhuang.bridge;

/**
 * 机型：笔记本
 * @author danhuang
 *
 */
public class Laptop extends Computer{
	
	public Laptop(Brand brand) {
		super(brand);
	}
	
	@Override
	public void sale() {
		super.sale();
		System.out.println("销售笔记本");
	}
}
