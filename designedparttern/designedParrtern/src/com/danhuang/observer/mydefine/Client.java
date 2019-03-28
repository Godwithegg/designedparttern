package com.danhuang.observer.mydefine;

/**
 * 观察者模式(自定义的，还有一种是javase自带的)
 * 核心
 * 	-观察者模式主要用于1：N的通知。当一个对象（目标对象Subject或Objservable）的状态变化时，他需要及时告知一系列对象（观察者对象），令他们作出响应
 * 通知观察者的方法：
 * 	推
 * 		-每次都会把通知以广播方法发送给所有观察者，所有观察者只能被动接收。
 * 	拉
 * 		-观察者只要直到有情况即可。至于什么时候获取内容，获取什么内容，都可以自主决定。
 * • 开发中常见的场景： 
 * 	– 聊天室程序的，服务器转发给所有客户端 – 网络游戏(多人联机对战)场景中，服务器将客户端的状态进行分发 – 邮件订阅 
 * 	– Servlet中，监听器的实现 – Android中，广播机制
 *  – JDK的AWT中事件处理模型,基于观察者模式的委派事件模型(Delegation  Event  Model) 
 * 		• 事件源----------------目标对象 
 * 		• 事件监听器------------观察者 – 京东商城中，群发某商品打折信息
 * @author danhuang
 *
 */
public class Client {
	public static void main(String[] args) {
		//目标对象
		ConcreteSubject subject = new ConcreteSubject();
		//创建多个观察者
		ObserverA observerA1 = new ObserverA();
		ObserverA observerA2 = new ObserverA();
		ObserverA observerA3 = new ObserverA();
		
		//让这三个观察者添加进入观察对象中
		subject.registerObserver(observerA1);
		subject.registerObserver(observerA2);
		subject.registerObserver(observerA3);
		
		//改变subject的状态
		subject.setState(3000);
		
		//查看观察者的状态是否变化
		System.out.println(observerA1.getMyState());
		System.out.println(observerA2.getMyState());
		System.out.println(observerA3.getMyState());
		
		subject.notifyAll();
		
	}
}
