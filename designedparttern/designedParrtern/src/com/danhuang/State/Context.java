package com.danhuang.State;

/**
 * ��������
 * ��־��ǰ�����ĸ�״̬
 * @author danhuang
 *
 */
public class Context {
	//���������ϵͳ�����Context������˺ţ����ݽ�ͬ���л���ͬ��״̬��
	private State state;

	public void setState(State state) {
		System.out.println("�޸�״̬��");
		this.state = state;
		state.handle();
	}
	
}
