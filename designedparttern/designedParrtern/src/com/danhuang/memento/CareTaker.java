package com.danhuang.memento;

/**
 * 负责人类 负责管理备忘录对象
 * 
 * @author danhuang
 *
 */
public class CareTaker {

	private EmpMemento memento;
	
	//private List<EmpMemento> list = new ArrayList<>();	通过这样的操作可以添加很多备忘点，也可以使用栈来返回上一个备忘点

	public EmpMemento getMemento() {
		return memento;
	}

	public void setMemento(EmpMemento memento) {
		this.memento = memento;
	}

}
