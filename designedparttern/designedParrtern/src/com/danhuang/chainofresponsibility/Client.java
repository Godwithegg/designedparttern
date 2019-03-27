package com.danhuang.chainofresponsibility;

/**
 * 责任链模式
 * 实现：
 * 	• 链表方式定义职责链(本案例) 
 * 	• 非链表方式实现职责链 
 * 		– 通过集合、数组生成职责链更加实用！实际上，很多项目中，每个具 体的Handler并不是由开发团队定义的，而是项目上线后由外部单位追 加的，所以使用链表方式定义COR链就很困难。
 *	• 开发中常见的场景： 
 *	– Java中，异常机制就是一种责任链模式。一个try可以对应多个catch， 当第一个catch不匹配类型，则自动跳到第二个catch. 
 *	– Javascript语言中，事件的冒泡和捕获机制。Java语言中，事件的处理 采用观察者模式。 
 *	– Servlet开发中，过滤器的链式处理
 * 	– Struts2中，拦截器的调用也是典型的责任链模式
 * @author danhuang
 *
 */
public class Client {
	public static void main(String[] args) {
		
		Leader leader1 = new Director("小白");
		Leader leader2 = new Manager("小黄");
		Leader leader3 = new GeneralManager("小黑");
		
		//组织责任链对象的关系
		leader1.setNextLeader(leader2);
		leader2.setNextLeader(leader3);
		
		//开始请假操作
		LeaveRequest leaveRequest = new LeaveRequest("tom", 3, "回家娶老婆");
		leader1.handleRequest(leaveRequest);
	}
}
