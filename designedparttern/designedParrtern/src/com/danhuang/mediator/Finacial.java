package com.danhuang.mediator;

/**
 * ����
 * @author danhuang
 *
 */
public class Finacial implements Department{

	private Mediator mediator;		//�����н��ߣ��ܾ���������
	public Finacial(Mediator mediator) {
		super();
		this.mediator = mediator;
		mediator.register("finacial", this);
	}
	@Override
	public void selfAction() {
		System.out.println("��������Ǯ��");
	}

	@Override
	public void outAction() {
		System.out.println("���񲿻㱨������");
	}
	
}
