package com.danhuang.prototype;

/**
 * 测试对象创建和对象克隆的时间
 * 
 * @author danhuang
 *
 */
public class Client4 {
	public static void newBook(int size) {
		long start = System.currentTimeMillis();
		for(int i=0;i<size;i++)
		{
			Book book = new Book();
		}
		long end = System.currentTimeMillis();
		System.out.println("原始耗时:"+(end-start));
	}
	public static void cloneBook(int size) throws Exception {
		Book book = new Book();
		long start = System.currentTimeMillis();
		for(int i=0;i<size;i++)
		{
			Book book1 = (Book)book.clone();
		}
		long end = System.currentTimeMillis();
		System.out.println("克隆耗时："+(end-start));
	}

	public static void main(String[] args) throws Exception {
		newBook(1000);
		cloneBook(1000);
	}
}

class Book implements Cloneable {
	public Book() {
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
