package com.danhuang.factory.simplefactory;

/**
 * �򵥹�����
 * @author danhuang
 *
 */
public class CarSimpleFactory1 {
	public static Car createCar(String type) {
		if("�µ�".equals(type)) {
			return new Audi();
		}else if("���ǵ�".equals(type)) {
			return new Byd();
		}else {
			return null;
		}
	}
}
