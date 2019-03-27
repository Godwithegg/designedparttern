package com.danhuang.mediator;

/**
 * �г���
 * @author danhuang
 *
 */
public class Market implements Department{

	private Mediator mediator;		//�����н��ߣ��ܾ���������
	public Market(Mediator mediator) {
		super();
		this.mediator = mediator;
		mediator.register("market", this);
	}
	@Override
	public void selfAction() {
		System.out.println("�г�����ȥ����Ŀ��");
	}

	@Override
	public void outAction() {
		System.out.println("�г����㱨������");
		mediator.command("finacial");
	}
	
}
