package com.danhuang.mediator;

/**
 * 中介者模式
 * • 中介者模式的本质： – 解耦多个同事对象之间的交互关系。每个对象都持有中介者对象的引 用，只跟中介者对象打交道。我们通过中介者对象统一管理这些交互 关系
 * • 开发中常见的场景： – MVC模式(其中的C，控制器就是一个中介者对象。M和V都和他打交 道) 
 * 		– 窗口游戏程序，窗口软件开发中窗口对象也是一个中介者对象
 *		– 图形界面开发GUI中，多个组件之间的交互，可以通过引入一个中介者 对象来解决，可以是整体的窗口对象或者DOM对象 
 *		– Java.lang.reflect.Method#invoke()
 * @author danhuang
 *
 */
public class Client {
	public static void main(String[] args) {
		Mediator m = new President();
		
		Market market = new Market(m);
		Development development = new Development(m);
		Finacial finacial = new Finacial(m);
		
		market.selfAction();
		market.outAction();
		finacial.selfAction();
	}
}
