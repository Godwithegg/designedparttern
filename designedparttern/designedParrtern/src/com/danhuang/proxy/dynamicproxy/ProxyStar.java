package com.danhuang.proxy.dynamicproxy;

/**
 * 代理对象什么都可以干，唯独不可以唱歌
 * @author danhuang
 *
 */
public class ProxyStar implements Star {
	
	private Star star;
	
	public ProxyStar(Star star) {
		super();
		this.star = star;
	}

	@Override
	public void confer() {
		System.out.println("ProxyStar confer");
	}

	@Override
	public void signContract() {
		System.out.println("ProxyStar signContract");
	}

	@Override
	public void bookTicket() {
		System.out.println("ProxyStar bookTicket");
	}

	@Override
	public void sing() {
		star.sing();
	}

	@Override
	public void collectMoney() {
		System.out.println("ProxyStar collectMoney");
	}

}
