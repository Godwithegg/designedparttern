package com.danhuang.memento;

/**
 * 备忘录模式
 * • 核心 
 * 	– 就是保存某个对象内部状态的拷贝，这样以后就可以将该对象恢复到 原先的状态。 
 * • 结构： 
 * 	– 源发器类Originator – 备忘录类Memento – 负责人类CareTaker
 * • 开发中常见的应用场景： 
 * 	– 棋类游戏中的，悔棋 
 * 	– 普通软件中的，撤销操作 
 * 	– 数据库软件中的，事务管理中的，回滚操作 
 * 	– Photoshop软件中的，历史记录
 * @author danhuang
 *
 */
public class Client {
	public static void main(String[] args) {
		CareTaker careTaker = new CareTaker();
	
		Emp emp = new Emp("蛋黄",18,200);
		System.out.println("第一次创建对象："+emp.getEname()+"年龄："+emp.getAge()+"工资："+emp.getSalary());
		
		careTaker.setMemento(emp.memento());//做了一次备份
		
		emp.setEname("jz");
		emp.setAge(20);
		emp.setSalary(2000);
		System.out.println("修改后的对象："+emp.getEname()+"年龄："+emp.getAge()+"工资："+emp.getSalary());
		
		emp.recovery(careTaker.getMemento());//恢复到备忘录保存的状态
		System.out.println("取回备份的对象："+emp.getEname()+"年龄："+emp.getAge()+"工资："+emp.getSalary());
		
	}
}
