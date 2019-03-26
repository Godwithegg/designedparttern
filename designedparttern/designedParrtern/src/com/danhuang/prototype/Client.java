package com.danhuang.prototype;

import java.util.Date;

/**
 * ԭ��ģʽ
 * ǳ��¡��Ķ���ͬ������ֵ��һ���ģ�������ͬһ������
 * @author danhuang
 *
 */
public class Client {
	public static void main(String[] args) throws Exception {
		
		Date d = new Date(100000000);
		Sheep sheep = new Sheep("����",d);
		Sheep sheep2 = (Sheep) sheep.clone();
		System.out.println(sheep.getBirthday());
		
		System.out.println("�޸ĺ�,����ͬʱ�ı�");
		d.setTime(19999999);
		System.out.println(sheep.getBirthday());
		System.out.println(sheep2.getBirthday());
	}
}
