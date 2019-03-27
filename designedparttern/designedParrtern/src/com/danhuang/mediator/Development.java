package com.danhuang.mediator;

/**
 * 同事类
 * @author danhuang
 *
 */
public class Development implements Department{

	private Mediator mediator;		//持有中介者（总经理）的引用
	public Development(Mediator mediator) {
		super();
		this.mediator = mediator;
		mediator.register("development", this);
	}
	@Override
	public void selfAction() {
		System.out.println("码农专心开发！");
	}

	@Override
	public void outAction() {
		System.out.println("码农汇报工作！");
	}
	
}
