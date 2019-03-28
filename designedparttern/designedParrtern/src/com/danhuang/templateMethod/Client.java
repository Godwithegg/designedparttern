package com.danhuang.templateMethod;

/**
 * 模板方法
 * 介绍：
 * 	模板方法模式是编程中经常用得到的模式。它定义了一个操作中的算法骨架，将某些步骤延迟到子类的实现。这样，新的子类可以在不改变一个算法的结构的前提下重新定义该算法的某些特定步骤。
 * 核心：
 * 	处理某个流程的代码已经具备，但是其中某个节点的代码暂时不能确定，因此我们采用工厂方法模式，将这个节点的代码实现转移给子类完成。
 * @author danhuang
 *
 */
public class Client {
	public static void main(String[] args) {
		BankTemplateMethod bankTemplateMethod = new DrawMoney();
		bankTemplateMethod.process();
		
		//不定义新子类的话，可以采用匿名内部类来实现
		BankTemplateMethod btm = new BankTemplateMethod() {
			
			@Override
			public void transact() {
				System.out.println("我要存钱");
			}
		};
		btm.process();
	}
}
