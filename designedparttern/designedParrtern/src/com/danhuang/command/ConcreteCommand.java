package com.danhuang.command;

public class ConcreteCommand implements Command {

	private Receiver receiver;

	public ConcreteCommand(Receiver receiver) {
		super();
		this.receiver = receiver;
	}

	@Override
	public void execute() {
		//命令真正执行前或后执行相关的处理
		receiver.action();
	}

}
