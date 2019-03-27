package com.danhuang.iterator;

/**
 * 迭代器模式
 * • 场景：
 *  – 提供一种可以遍历聚合对象的方式。又称为：游标cursor模式
 *  – 聚合对象：存储数据 
 *  – 迭代器：遍历数据
 * 开发中常见的场景： 
 * 	– JDK内置的迭代器(List/Set)
 * @author danhuang
 *
 */
public class Client {
	public static void main(String[] args) {
		ConcreteMyAggregate concreteMyAggregate = new ConcreteMyAggregate();
		concreteMyAggregate.addObject("aa");
		concreteMyAggregate.addObject("bb");
		concreteMyAggregate.addObject("cc");
		
		MyIterator iter = concreteMyAggregate.createIterator();
		while(iter.hasNext()) {
			System.out.println(iter.getCurrentObj());
			iter.next(); 
		}
	}
}
