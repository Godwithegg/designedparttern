package com.danhuang.builder;

/**
 * �����ɵ�����ɴ�
 * 
 * @author danhuang
 *
 */
public class AirShip {
	private OrbitalModule orbitalModule; // �����
	private Engine engine; // ������
	private EscapeTower escapeTower; // ������

	public static void launch() {
		System.out.println("���䣡");
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
