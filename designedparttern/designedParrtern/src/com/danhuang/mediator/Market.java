package com.danhuang.mediator;

/**
 * 市场部
 * @author danhuang
 *
 */
public class Market implements Department{

	private Mediator mediator;		//持有中介者（总经理）的引用
	public Market(Mediator mediator) {
		super();
		this.mediator = mediator;
		mediator.register("market", this);
	}
	@Override
	public void selfAction() {
		System.out.println("市场部跑去接项目！");
	}

	@Override
	public void outAction() {
		System.out.println("市场部汇报工作！");
		mediator.command("finacial");
	}
	
}
