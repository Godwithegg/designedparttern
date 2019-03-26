package com.danhuang.facade;

/**
 * 办理做饭，洗碗的任务
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
