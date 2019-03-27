package com.danhuang.chainofresponsibility;

/**
 * 抽象类
 * 
 * @author danhuang
 *
 */
public abstract class Leader {
	protected String name;
	protected Leader nextLeader; // 责任链上的后继对象

	public Leader(String name) {
		super();
		this.name = name;
	}

	//设定责任链上的后继对象 
	public void setNextLeader(Leader nextLeader) {
		this.nextLeader = nextLeader;
	}

	/**
	 * 处理请求的核心业务
	 * @param request
	 */
	public abstract void handleRequest(LeaveRequest request);
}
