package com.danhuang.bridge;

/**
 * ���ͣ��ʼǱ�
 * @author danhuang
 *
 */
public class Laptop extends Computer{
	
	public Laptop(Brand brand) {
		super(brand);
	}
	
	@Override
	public void sale() {
		super.sale();
		System.out.println("���۱ʼǱ�");
	}
}
