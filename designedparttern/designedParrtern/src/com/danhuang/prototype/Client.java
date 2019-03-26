package com.danhuang.prototype;

import java.util.Date;

/**
 * 原型模式
 * 浅克隆后的对象不同，但是值是一样的，即引用同一个对象
 * @author danhuang
 *
 */
public class Client {
	public static void main(String[] args) throws Exception {
		
		Date d = new Date(100000000);
		Sheep sheep = new Sheep("多利",d);
		Sheep sheep2 = (Sheep) sheep.clone();
		System.out.println(sheep.getBirthday());
		
		System.out.println("修改后,对象同时改变");
		d.setTime(19999999);
		System.out.println(sheep.getBirthday());
		System.out.println(sheep2.getBirthday());
	}
}
