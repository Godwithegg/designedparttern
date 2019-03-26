package com.danhuang.prototype;

/**
 * ���Զ��󴴽��Ͷ����¡��ʱ��
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
		System.out.println("ԭʼ��ʱ:"+(end-start));
	}
	public static void cloneBook(int size) throws Exception {
		Book book = new Book();
		long start = System.currentTimeMillis();
		for(int i=0;i<size;i++)
		{
			Book book1 = (Book)book.clone();
		}
		long end = System.currentTimeMillis();
		System.out.println("��¡��ʱ��"+(end-start));
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
