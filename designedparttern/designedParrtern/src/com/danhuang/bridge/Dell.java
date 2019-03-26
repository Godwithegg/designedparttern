package com.danhuang.bridge;

/**
 * 品牌：戴尔
 * @author danhuang
 *
 */
public class Dell implements Brand{
	
	@Override
	public void sale() {
		System.out.println("销售戴尔电脑");
	}
}
