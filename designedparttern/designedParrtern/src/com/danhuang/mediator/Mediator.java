package com.danhuang.mediator;

/**
 * �ܾ���ӿ�
 * @author danhuang
 *
 */
public interface Mediator {
	void register(String dname,Department d);
	void command(String dname);
}
