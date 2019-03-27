package com.danhuang.chainofresponsibility;

/**
 * 主任类
 * @author danhuang
 *
 */
public class GeneralManager extends Leader{

	public GeneralManager(String name) {
		super(name);
	}
	@Override
	public void handleRequest(LeaveRequest request) {
		if(request.getLeaveDays() < 30) {
			System.out.println("员工"+request.getEmpName()+"请假"+request.getLeaveDays()+","+request.getReason());
			System.out.println("总经理"+this.name+"审批通过");
		}else if(request.getLeaveDays() >= 30) {
			System.out.println("莫非"+request.getEmpName()+"想辞职，居然请假"+request.getLeaveDays()+"天！");
		}
	}
	
}
