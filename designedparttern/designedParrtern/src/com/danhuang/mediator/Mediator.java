package com.danhuang.mediator;

/**
 * 总经理接口
 * @author danhuang
 *
 */
public interface Mediator {
	void register(String dname,Department d);
	void command(String dname);
}
