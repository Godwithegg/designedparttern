package com.danhuang.command;

public interface Command {
	/**
	 * 这个方法是一个返回结果为空的方法
	 * 实际项目种可以根据需求设计多个不同的方法
	 */
	void execute();
}
