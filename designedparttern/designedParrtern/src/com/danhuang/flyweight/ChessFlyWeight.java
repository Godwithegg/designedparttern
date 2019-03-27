package com.danhuang.flyweight;

/**
 * 享元类
 * @author danhuang
 *
 */
public interface ChessFlyWeight {
	
	void setColor(String color);	//设置棋子颜色
	String getColor();	//获取棋子颜色
	void display(Coordinate coordinate);	//棋子坐标
}
