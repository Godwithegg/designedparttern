package com.danhuang.factory.abstractfactory;

public interface CarFactory {
	//����������
	Engine createEngine();
	//��������
	Seat createSeat();
	//������̥
	Tyre createTyre();
}
