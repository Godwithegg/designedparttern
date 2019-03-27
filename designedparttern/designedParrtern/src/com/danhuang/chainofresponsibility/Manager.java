package com.danhuang.chainofresponsibility;

/**
 * 主任类
 * @author danhuang
 *
 */
public class Manager extends Leader{

	public Manager(String name) {
		super(name);
	}
	@Override
	public void handleRequest(LeaveRequest request) {
		if(request.getLeaveDays() < 10) {
			System.out.println("员工"+request.getEmpName()+"请假"+request.getLeaveDays()+","+request.getReason());
			System.out.println("经理"+this.name+"审批通过");
		}else if(request.getLeaveDays() >= 10) {
			if(this.nextLeader != null) {
				this.nextLeader.handleRequest(request);
			}
		}
	}
	
}
