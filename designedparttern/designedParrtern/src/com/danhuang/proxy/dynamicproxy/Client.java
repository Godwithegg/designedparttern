package com.danhuang.proxy.dynamicproxy;

import java.lang.reflect.Proxy;

/**
 * æ≤Ã¨¥˙¿Ì≤‚ ‘
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
