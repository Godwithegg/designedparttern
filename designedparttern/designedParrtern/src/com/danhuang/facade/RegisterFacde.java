package com.danhuang.facade;

/**
 * ����������ϴ�������
 * @author danhuang
 *
 */
public class RegisterFacde {
	public void register() {
		KitChen cook = new Cook();
		cook.cooking();
		WashRoom washRoom = new Wash();
		washRoom.washing();
	}
}
