package com.danhuang.builder;

public class SxtAirShipBuilder implements AirShipBuilder{
	//StringBuilder,�Ժ�ѧϰXML�����У�JDOM���е���DomBuilder,SaxBuilder

	@Override
	public Engine builderEngine() {
		System.out.println("���������ɵķ�����");
		return new Engine("�����ɵķ�����");
	}

	@Override
	public OrbitalModule builderOrbitalModule() {

		System.out.println("���������ɵĹ����");
		return new OrbitalModule("�����ɵĹ����");
	}

	@Override
	public EscapeTower builderEscapeTower() {

		System.out.println("���������ɵ�������");
		return new EscapeTower("�����ɵ�������");
	}	
	
}
