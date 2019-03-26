package com.danhuang.composite;

/**
 * 这是组合模式的基本思想
 */

/**
 * 抽象组件
 * @author danhuang
 *
 */
public interface Component {
	void operation();
}

/**
 * 容器组件（类似父亲节点）
 * @author danhuang
 *
 */
interface Composite extends Component{
	void add(Component c);
	void remove(Component c);
	Component getChild(int index);
}

/**
 * 叶子节点
 * @author danhuang
 *
 */
interface Leaf extends Component{
	
}