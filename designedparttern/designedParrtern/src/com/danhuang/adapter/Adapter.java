package com.danhuang.adapter;

/**
 * ÊÊÅäÆ÷
 * @author danhuang
 *
 */
public class Adapter extends Adaptee implements Target{

	@Override
	public void handleRequest() {
		System.out.print("ÊÊÅäÆ÷´¦Àí:");
		super.request();
	}

}
