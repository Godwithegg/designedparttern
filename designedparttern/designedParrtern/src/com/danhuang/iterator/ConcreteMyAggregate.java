package com.danhuang.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * �Զ���ľۺ���
 * 
 * @author danhuang
 *
 */
public class ConcreteMyAggregate {
	private List<Object> list = new ArrayList<>();

	public void addObject(Object obj) {
		this.list.add(obj);
	}

	public void removeObj(Object obj) {
		this.list.remove(obj);
	}

	public List<Object> getList() {
		return list;
	}

	public void setList(List<Object> list) {
		this.list = list;
	}
	
	//��õ�����
	public MyIterator createIterator() {
		return new ConcreteIterator();
	}
	
	//ʹ���ڲ��ඨ�������������ֱ��ʹ���ⲿ�������
	private class ConcreteIterator implements MyIterator{
		
		private int cursor; 	//�����α����ڼ�¼����ʱ��λ��
		
		@Override
		public void first() {
			cursor = 0;
		}

		@Override
		public void next() {
			if(cursor < list.size()) {
				cursor ++;
			}
		}

		@Override
		public boolean hasNext() {
			if(cursor < list.size()) {
				return true;
			}else return false;
		}

		@Override
		public boolean isFirst() {
			return cursor == 0?true:false;
		}

		@Override
		public boolean isLast() {
			return cursor == (list.size()-1)?true:false;
		}

		@Override
		public Object getCurrentObj() {
			return list.get(cursor);
		}
		
	}
}
