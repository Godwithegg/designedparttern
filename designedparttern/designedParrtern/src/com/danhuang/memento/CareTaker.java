package com.danhuang.memento;

/**
 * �������� ���������¼����
 * 
 * @author danhuang
 *
 */
public class CareTaker {

	private EmpMemento memento;
	
	//private List<EmpMemento> list = new ArrayList<>();	ͨ�������Ĳ���������Ӻܶ౸����

	public EmpMemento getMemento() {
		return memento;
	}

	public void setMemento(EmpMemento memento) {
		this.memento = memento;
	}

}
