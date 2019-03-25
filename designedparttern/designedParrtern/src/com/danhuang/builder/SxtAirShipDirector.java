package com.danhuang.builder;

public class SxtAirShipDirector implements AirShipDirector {

	private AirShipBuilder builder;

	public SxtAirShipDirector(AirShipBuilder builder) {
		this.builder = builder;
	}

	@Override
	public AirShip directAirShip() {
		Engine engine = builder.builderEngine();
		OrbitalModule orbitalModule = builder.builderOrbitalModule();
		EscapeTower escapeTower = builder.builderEscapeTower();

		AirShip ship = new AirShip();
		ship.setEngine(engine);
		ship.setOrbitalModule(orbitalModule);
		ship.setEscapeTower(escapeTower);
		return ship;
	}

}
