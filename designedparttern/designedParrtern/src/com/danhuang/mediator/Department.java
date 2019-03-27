package com.danhuang.mediator;

/**
 * 同事类的接口
 * @author danhuang
 *
 */
public interface Department {
	void selfAction();	//做部门的事情
	void outAction();	//向总经理发出申请
}
