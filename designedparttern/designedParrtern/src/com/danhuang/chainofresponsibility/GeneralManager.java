package com.danhuang.chainofresponsibility;

/**
 * ������
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
			System.out.println("Ա��"+request.getEmpName()+"���"+request.getLeaveDays()+","+request.getReason());
			System.out.println("�ܾ���"+this.name+"����ͨ��");
		}else if(request.getLeaveDays() >= 30) {
			System.out.println("Ī��"+request.getEmpName()+"���ְ����Ȼ���"+request.getLeaveDays()+"�죡");
		}
	}
	
}
