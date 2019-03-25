package com.danhuang.singleton;

import java.util.concurrent.CountDownLatch;

/**
 *  问题： – 反射可以破解上面几种(不包含枚举式)实现方式！（可以在构造方法中手动 抛出异常控制） 
 *  		可以通过定义readResolve()防止获得不同对象。 – 反序列化时，如果对象所在类定义了readResolve()，
 *  		（实际是一种回调）， 定义返回哪个对象。 
 * @author danhuang
 *
 */
public class Client {
	public static void main(String[] args) throws InterruptedException {
		/**
		 * 利用该方式检测是否是单例模式
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
		countDownLatch.await();//main线程阻塞，直到计数器变为0才向下执行
		
		long end = System.currentTimeMillis();
		System.out.println("总耗时:"+(end-start));
	}
}
