package com.danhuang.singleton;

import java.util.concurrent.CountDownLatch;

/**
 *  ���⣺ �C ��������ƽ����漸��(������ö��ʽ)ʵ�ַ�ʽ���������ڹ��췽�����ֶ� �׳��쳣���ƣ� 
 *  		����ͨ������readResolve()��ֹ��ò�ͬ���� �C �����л�ʱ��������������ඨ����readResolve()��
 *  		��ʵ����һ�ֻص����� ���巵���ĸ����� 
 * @author danhuang
 *
 */
public class Client {
	public static void main(String[] args) throws InterruptedException {
		/**
		 * ���ø÷�ʽ����Ƿ��ǵ���ģʽ
		 */
		Object o1 = HungryMan.getInstance();
		Object o2 = HungryMan.getInstance();
		System.out.println(o1 == o2);
		
		long start = System.currentTimeMillis();
		int threadNum = 10;
		final CountDownLatch countDownLatch = new CountDownLatch(threadNum);
		for(int i=0;i<threadNum;i++) {
			new Thread(new Runnable() {
				
				@Override
				public void run() {
					for(int j=0;j<100000;j++) {
						Object o = StaticGroup.getInstance();
					}
					countDownLatch.countDown();
				}
				
			}).start();
		}
		countDownLatch.await();//main�߳�������ֱ����������Ϊ0������ִ��
		
		long end = System.currentTimeMillis();
		System.out.println("�ܺ�ʱ:"+(end-start));
	}
}
