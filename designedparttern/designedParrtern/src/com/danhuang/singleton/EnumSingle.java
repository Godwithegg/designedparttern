package com.danhuang.singleton;

/**
 * 枚举单例模式
 * 特点：线程安全，调用效率高，不能延时加载
 * @author danhuang
 *
 */
public enum EnumSingle {
	/**
	 * 定义一个枚举类型的元素，它就代表了该类的一个实例
	 */
	INSTANCE;
	/**
	 * 单例可以有自己的操作
	 */
	public void singletonOperation() {
		
	}
}
