package com.danhuang.builder;

/**
 * µ∞ª∆≈…µƒ”Ó÷Ê∑…¥¨
 * 
 * @author danhuang
 *
 */
public class AirShip {
	private OrbitalModule orbitalModule; // πÏµ¿≤’
	private Engine engine; // ∑¢∂Øª˙
	private EscapeTower escapeTower; // Ã”“›À˛

	public static void launch() {
		System.out.println("∑¢…‰£°");
	}
	
	public OrbitalModule getOrbitalModule() {
		return orbitalModule;
	}

	public void setOrbitalModule(OrbitalModule orbitalModule) {
		this.orbitalModule = orbitalModule;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public EscapeTower getEscapeTower() {
		return escapeTower;
	}

	public void setEscapeTower(EscapeTower escapeTower) {
		this.escapeTower = escapeTower;
	}

}
