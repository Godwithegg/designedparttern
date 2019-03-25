package com.danhuang.singleton;

/**
 * 静态成员变量模式
 * 特点：线程安全，调用效率高。 但是，可以延时加载
 * @author danhuang
 *
 */
public class StaticGroup {
	private static class StaticInstance{
		private static StaticGroup instance = new StaticGroup();
	}
	private StaticGroup(){}
	public static StaticGroup getInstance() {
		return StaticInstance.instance;
	}
	
	
}
