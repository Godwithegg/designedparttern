package com.danhuang.facade;

/**
 * 外观模式
 * @author danhuang
 * 特点：为子系统提供统一的入口。封装子系统的复杂性，便于客户端调用。
 * 	开发中常见的场景 – 频率很高。哪里都会遇到。各种技术和框架中，都 有外观模式的使用。
 * 		如： •JDBC封装后的，commons提供的DBUtils类， Hibernate提供的工具类、Spring JDBC工具类等
 */
public class Client {
	public static void main(String[] args) {
		new RegisterFacde().register();
	}
}
