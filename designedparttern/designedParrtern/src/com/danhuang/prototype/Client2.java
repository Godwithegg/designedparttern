package com.danhuang.prototype;

import java.util.Date;

/**
 * ԭ��ģʽ
 * ���¡
 * @author danhuang
 *
 */
public class Client2 {
	public static void main(String[] args) throws Exception {
		
		Date date = new Date();
		SheepDeep sheep = new SheepDeep("����",date);	
		SheepDeep sheep2 = (SheepDeep) sheep.clone();//ʵ����ƣ�sheep2��������һ���¶���
		System.out.println(sheep.getBirthday());
		
		date.setTime(19999999);
		System.out.println("�޸ĺ�,����Ҳһ���޸��ˣ������ǵ�ͬ��");
		System.out.println(sheep.getBirthday());
		System.out.println(sheep2.getBirthday());
		
	}
}
