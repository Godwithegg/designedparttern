package com.danhuang.iterator;

/**
 * �Զ���ĵ������ӿ�
 * @author danhuang
 *
 */
public interface MyIterator {
	void first();	//���α�ָ���һ��Ԫ��
	void next();	//���α�ָ����һ��Ԫ��
	boolean hasNext();	//�ж��Ƿ������һ��Ԫ��
	boolean isFirst();	//�ж��Ƿ��һ��Ԫ��
	boolean isLast();	//�ж��Ƿ����һ��Ԫ��
	Object getCurrentObj();	//��ȡ��ǰ�α�ָ��Ķ���
}
