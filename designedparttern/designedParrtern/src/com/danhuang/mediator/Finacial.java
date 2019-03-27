package com.danhuang.mediator;

/**
 * 财务部
 * @author danhuang
 *
 */
public class Finacial implements Department{

	private Mediator mediator;		//持有中介者（总经理）的引用
	public Finacial(Mediator mediator) {
		super();
		this.mediator = mediator;
		mediator.register("finacial", this);
	}
	@Override
	public void selfAction() {
		System.out.println("财务部在数钱！");
	}

	@Override
	public void outAction() {
		System.out.println("财务部汇报工作！");
	}
	
}
