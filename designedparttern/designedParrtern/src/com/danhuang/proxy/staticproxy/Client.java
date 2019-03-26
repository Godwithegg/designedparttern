package com.danhuang.proxy.staticproxy;

import java.lang.reflect.Proxy;

/**
 * ��̬��������
 * @author danhuang
 *
 */
public class Client {
	public static void main(String[] args) {
		Star realStar = new RealStar();
		StarHandler handler = new StarHandler(realStar);
		
		Star proxy = (Star) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[] {Star.class}, handler);
		proxy.sing();
	}
}