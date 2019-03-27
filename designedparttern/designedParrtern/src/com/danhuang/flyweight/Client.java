package com.danhuang.flyweight;

/**
 * 享元模式
 * 场景： – 内存属于稀缺资源，不要随便浪费。如果有很多个完全相同或相似的 对象，我们可以通过享元模式，节省内存。
 * 核心： – 享元模式以共享的方式高效地支持大量细粒度对象的重用。
 *     – 享元对象能做到共享的关键是区分了内部状态和外部状态。 • 内部状态：可以共享，不会随环境变化而改变 • 外部状态：不可以共享，会随环境变化而改变
 * 实现： 享元模式实现： – FlyweightFactory享元工厂类 • 创建并管理享元对象，享元池一般设计成键值对
 *  	– FlyWeight抽象享元类 • 通常是一个接口或抽象类，声明公共方法，这些方法可以向外界提供对象 的内部状态，设置外部状态。
 *  	– ConcreteFlyWeight具体享元类 • 为内部状态提供成员变量进行存储
 *  	– UnsharedConcreteFlyWeight非共享享元类 • 不能被共享的子类可以设计为非共享享元类
 * 享元模式开发中应用的场景： 
 *  – 享元模式由于其共享的特性，可以在任何“池”中操作， 比如：线程池、数据库连接池。 
 *  – String类的设计也是享元模式
 * @author danhuang
 *
 */
public class Client {
	public static void main(String[] args) {
		 ChessFlyWeight chess1 = ChessFlyWeightFactory.getChess("黑色");
		 ChessFlyWeight chess2 = ChessFlyWeightFactory.getChess("黑色");
		 System.out.println(chess1);
		 System.out.println(chess2);
		 
		 System.out.println("增加外部状态处理");
		 chess1.display(new Coordinate(10, 10));
		 chess2.display(new Coordinate(20, 20));
			
	}
}
