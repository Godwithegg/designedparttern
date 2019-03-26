package com.danhuang.prototype;

import java.util.Date;

/**
 * 原型模式
 * 深克隆
 * @author danhuang
 *
 */
public class Client2 {
	public static void main(String[] args) throws Exception {
		
		Date date = new Date();
		SheepDeep sheep = new SheepDeep("多利",date);	
		SheepDeep sheep2 = (SheepDeep) sheep.clone();//实现深复制，sheep2的属性是一个新对象
		System.out.println(sheep.getBirthday());
		
		date.setTime(19999999);
		System.out.println("修改后,对象也一起修改了，所以是等同的");
		System.out.println(sheep.getBirthday());
		System.out.println(sheep2.getBirthday());
		
	}
}
