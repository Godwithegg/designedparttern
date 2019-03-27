package com.danhuang.mediator;

/**
 * ͬ����
 * @author danhuang
 *
 */
public class Development implements Department{

	private Mediator mediator;		//�����н��ߣ��ܾ���������
	public Development(Mediator mediator) {
		super();
		this.mediator = mediator;
		mediator.register("development", this);
	}
	@Override
	public void selfAction() {
		System.out.println("��ũר�Ŀ�����");
	}

	@Override
	public void outAction() {
		System.out.println("��ũ�㱨������");
	}
	
}
