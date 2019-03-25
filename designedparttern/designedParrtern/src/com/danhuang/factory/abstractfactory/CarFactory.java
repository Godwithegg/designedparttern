package com.danhuang.factory.abstractfactory;

public interface CarFactory {
	//创建发动机
	Engine createEngine();
	//创建座椅
	Seat createSeat();
	//创建轮胎
	Tyre createTyre();
}
