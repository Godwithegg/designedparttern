package com.danhuang.composite;

/**
 * �������ģʽ�Ļ���˼��
 */

/**
 * �������
 * @author danhuang
 *
 */
public interface Component {
	void operation();
}

/**
 * ������������Ƹ��׽ڵ㣩
 * @author danhuang
 *
 */
interface Composite extends Component{
	void add(Component c);
	void remove(Component c);
	Component getChild(int index);
}

/**
 * Ҷ�ӽڵ�
 * @author danhuang
 *
 */
interface Leaf extends Component{
	
}