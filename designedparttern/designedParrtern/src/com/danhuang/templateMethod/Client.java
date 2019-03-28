package com.danhuang.templateMethod;

/**
 * ģ�巽��
 * ���ܣ�
 * 	ģ�巽��ģʽ�Ǳ���о����õõ���ģʽ����������һ�������е��㷨�Ǽܣ���ĳЩ�����ӳٵ������ʵ�֡��������µ���������ڲ��ı�һ���㷨�Ľṹ��ǰ�������¶�����㷨��ĳЩ�ض����衣
 * ���ģ�
 * 	����ĳ�����̵Ĵ����Ѿ��߱�����������ĳ���ڵ�Ĵ�����ʱ����ȷ����������ǲ��ù�������ģʽ��������ڵ�Ĵ���ʵ��ת�Ƹ�������ɡ�
 * @author danhuang
 *
 */
public class Client {
	public static void main(String[] args) {
		BankTemplateMethod bankTemplateMethod = new DrawMoney();
		bankTemplateMethod.process();
		
		//������������Ļ������Բ��������ڲ�����ʵ��
		BankTemplateMethod btm = new BankTemplateMethod() {
			
			@Override
			public void transact() {
				System.out.println("��Ҫ��Ǯ");
			}
		};
		btm.process();
	}
}
