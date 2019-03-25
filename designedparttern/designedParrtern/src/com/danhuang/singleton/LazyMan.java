package com.danhuang.singleton;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * 饿汉模式
 * 特点：线程安全，调用效率不高。 但是，可以延时加载。
 * 为了防止反序列化和反射，做了构造器处理和定义了readResolve方法
 * @author danhuang
 *
 */
public class LazyMan implements Serializable{
	private static LazyMan instance = null;
	public static synchronized LazyMan getInstance() throws Exception {
		if(instance == null) {
			instance = new LazyMan();
		}
		return instance;
	}
	
	private LazyMan() throws Exception{
		if(instance != null) {
			throw new Exception("已经实例化过");
		}
	}
	//反序列化时，如果对象所在类定义了readResolve()，（实际是一种回调），定义返回哪个对象。
	public Object readResolve() throws ObjectStreamException{
		return instance;
	}
}
