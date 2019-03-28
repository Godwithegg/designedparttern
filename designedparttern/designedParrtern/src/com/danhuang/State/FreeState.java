package com.danhuang.State;

/**
 * 空闲状态类
 * @author danhuang
 *
 */
public class FreeState implements State{
	
	@Override
	public void handle() {
		System.out.println("房间空闲！没人入住");
	}
	
}
