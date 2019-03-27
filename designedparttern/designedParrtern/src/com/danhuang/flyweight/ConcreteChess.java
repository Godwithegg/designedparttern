package com.danhuang.flyweight;

/**
 * ������Ԫ��(����)
 * @author danhuang
 *
 */
public class ConcreteChess implements ChessFlyWeight{

	private String color;
	
	public ConcreteChess(String color) {
		super();
		this.color = color;
	}

	@Override
	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String getColor() {
		return color;
	}

	@Override
	public void display(Coordinate coordinate) {
		System.out.println("������ɫ"+color);
		System.out.println("����λ��"+coordinate.getX()+","+coordinate.getY());
	}
	
}
