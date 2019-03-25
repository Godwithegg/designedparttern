package com.danhuang.builder;

/**
 * 建造者模式
 * 使用多个简单的的对象一步步构建成一个复杂的对象
 * 这个项目我的理解是：
 * 	一个飞船有多个功能，这些功能分别对应不同的对象，这些功能分为两个接口，一个是建造飞船部件对象的接口（Builder)，一个是建造飞船部件功能的接口(Director)
 * 		然后用两个类分别实现接口。这便是建造者模式的用意，将复杂的功能单独分开，各自实现。
 * @author danhuang
 *
 */
public class Client {
	public static void main(String[] args) {
		AirShipDirector airShipDirector = new SxtAirShipDirector(new SxtAirShipBuilder());
		AirShip airShip = airShipDirector.directAirShip();
		System.out.println(airShip.getEngine().getName());
		airShip.launch();
	}
}
