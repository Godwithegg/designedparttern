package com.danhuang.strategy;

/**
 * �������� ����;���Ĳ����ཻ�� �����Ļ���������㷨ֱ�ӺͿͻ��˵��÷����ˣ�ʹ���㷨���Զ����ڿͻ��˶����ı仯
 * ���ʹ��spring������ע�빦�ܣ�������ͨ�������ļ�����̬��ע�벻ͬ���Զ��󣬶�̬���л���ͬ���㷨
 * 
 * @author danhuang
 *
 */
public class Context {

	// ����ͨ��ͨ����������ע��
	private Strategy strategy; // ��ǰ���õ��㷨

	public Context(Strategy strategy) {
		super();
		this.strategy = strategy;
	}

	// ����ͨ��set������ע��
	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}

	public void pringPrice(double s) {
		System.out.println("���ñ��ۣ�" + strategy.getPrice(s));
	}
}
