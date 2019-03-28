package com.danhuang.State;

/**
 * 预定
 * @author danhuang
 *
 */
public class BookState implements State{
	
	@Override
	public void handle() {
		System.out.println("房间已预定！别人不能预定了！");
	}
}
