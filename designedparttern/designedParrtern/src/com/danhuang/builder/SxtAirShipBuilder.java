package com.danhuang.builder;

public class SxtAirShipBuilder implements AirShipBuilder{
	//StringBuilder,以后学习XML解析中，JDOM库中的类DomBuilder,SaxBuilder

	@Override
	public Engine builderEngine() {
		System.out.println("构建蛋黄派的发动机");
		return new Engine("蛋黄派的发动机");
	}

	@Override
	public OrbitalModule builderOrbitalModule() {

		System.out.println("构建蛋黄派的轨道舱");
		return new OrbitalModule("蛋黄派的轨道舱");
	}

	@Override
	public EscapeTower builderEscapeTower() {

		System.out.println("构建蛋黄派的逃逸塔");
		return new EscapeTower("蛋黄派的逃逸塔");
	}	
	
}
