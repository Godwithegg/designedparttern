package com.danhuang.singleton;

/**
 * 双重检测锁模式
 * 特点：由于JVM底层内部模型原因，偶尔会出问题。不建议使用
 * @author danhuang
 *
 */
public class DoubleLock {
	private static DoubleLock instance = null;
	public static DoubleLock getInstance() {
		if(instance == null) {
			DoubleLock sc;
			synchronized(DoubleLock.class) {
				sc = instance;
				if(sc == null) {
					synchronized(DoubleLock.class) {
						if(sc == null) {
							sc = new DoubleLock();
						}
					}
				instance = sc;
				}
			}
		}
		return instance;
	}
}
