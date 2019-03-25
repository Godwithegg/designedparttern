package com.danhuang.builder;

public class Client {
	public static void main(String[] args) {
		AirShipDirector airShipDirector = new SxtAirShipDirector(new SxtAirShipBuilder());
		AirShip airShip = airShipDirector.directAirShip();
		System.out.println(airShip.getEngine().getName());
		airShip.launch();
	}
}
