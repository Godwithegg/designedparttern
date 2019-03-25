package com.danhuang.factory.abstractfactory;

/**
 * 奢侈牌的发动机
 * @author danhuang
 *
 */
public class LuxuryEngine implements Engine{

	@Override
	public void run() {
		System.out.println("跑得快");
	}

	@Override
	public void start() {
		System.out.println("启动快！");
	}
	
}
