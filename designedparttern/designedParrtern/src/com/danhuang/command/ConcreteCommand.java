package com.danhuang.command;

public class ConcreteCommand implements Command {

	private Receiver receiver;

	public ConcreteCommand(Receiver receiver) {
		super();
		this.receiver = receiver;
	}

	@Override
	public void execute() {
		//��������ִ��ǰ���ִ����صĴ���
		receiver.action();
	}

}