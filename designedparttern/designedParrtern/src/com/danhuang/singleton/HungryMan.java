package com.danhuang.singleton;


/**
 * 饿汉模式
 * 特点：（线程安全，调用效率高。 但是，不能延时加载。）
 * @author danhuang
 *
 */
public class HungryMan {
	private static final HungryMan instance = new HungryMan();
	public static HungryMan getInstance() {
		return instance;
	}
	private HungryMan(){}
	
}
