package com.danhuang.flyweight;

/**
 * ��Ԫ��
 * @author danhuang
 *
 */
public interface ChessFlyWeight {
	
	void setColor(String color);	//����������ɫ
	String getColor();	//��ȡ������ɫ
	void display(Coordinate coordinate);	//��������
}
