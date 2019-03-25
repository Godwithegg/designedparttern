package com.danhuang.builder;

/**
 * ������ģʽ
 * ʹ�ö���򵥵ĵĶ���һ����������һ�����ӵĶ���
 * �����Ŀ�ҵ�����ǣ�
 * 	һ���ɴ��ж�����ܣ���Щ���ֱܷ��Ӧ��ͬ�Ķ�����Щ���ܷ�Ϊ�����ӿڣ�һ���ǽ���ɴ���������Ľӿڣ�Builder)��һ���ǽ���ɴ��������ܵĽӿ�(Director)
 * 		Ȼ����������ֱ�ʵ�ֽӿڡ�����ǽ�����ģʽ�����⣬�����ӵĹ��ܵ����ֿ�������ʵ�֡�
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
