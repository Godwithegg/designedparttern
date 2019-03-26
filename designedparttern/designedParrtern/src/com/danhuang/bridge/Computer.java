package com.danhuang.bridge;

/**
 * »úĞÍ¸¸Ç×
 * @author danhuang
 *
 */
public class Computer {
	
	protected Brand brand;
	public Computer(Brand brand) {
		this.brand = brand;
	}
	public void sale() {
		brand.sale();
	}
}
