package com.danhuang.State;

/**
 * Ԥ��
 * @author danhuang
 *
 */
public class BookState implements State{
	
	@Override
	public void handle() {
		System.out.println("������Ԥ�������˲���Ԥ���ˣ�");
	}
}