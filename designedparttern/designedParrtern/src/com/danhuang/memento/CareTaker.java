package com.danhuang.memento;

/**
 * �������� ���������¼����
 * 
 * @author danhuang
 *
 */
public class CareTaker {

	private EmpMemento memento;
	
	//private List<EmpMemento> list = new ArrayList<>();	ͨ�������Ĳ���������Ӻܶ౸���㣬Ҳ����ʹ��ջ��������һ��������

	public EmpMemento getMemento() {
		return memento;
	}

	public void setMemento(EmpMemento memento) {
		this.memento = memento;
	}

}
