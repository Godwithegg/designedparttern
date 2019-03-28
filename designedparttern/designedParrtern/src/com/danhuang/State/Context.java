package com.danhuang.State;

/**
 * 上下文类
 * 标志当前处于哪个状态
 * @author danhuang
 *
 */
public class Context {
	//如果是银行系统，这个Context类就是账号，根据金额不同，切换不同的状态！
	private State state;

	public void setState(State state) {
		System.out.println("修改状态：");
		this.state = state;
		state.handle();
	}
	
}
