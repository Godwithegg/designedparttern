package com.danhuang.command;

/**
 * 命令模式
 * • 开发中常见的场景：
 *  – Struts2中，action的整个调用过程中就有命令模式。 
 *  – 数据库事务机制的底层实现 
 *  – 命令的撤销和恢复
 * @author danhuang
 *
 */
public class Client {
	public static void main(String[] args) {
		Command command = new ConcreteCommand(new Receiver());
		Invoke i = new Invoke(command);
		i.call();
	}
}
