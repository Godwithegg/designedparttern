package com.danhuang.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * �ļ���
 * @author danhuang
 *
 */
public class Folder implements AbstractFile{

	private String name;
	//����������������ű����������µ��ӽڵ�
	private List<AbstractFile> list = new ArrayList<>();
	 
	@Override
	public void killVirus() {
		System.out.println("�ļ��У�"+name+",���в�ɱ��");
		for(AbstractFile file:list) {
			file.killVirus();
		}
	}
	
	public Folder(String name) {
		this.name = name;
	}
	
	public void add(AbstractFile file) {
		list.add(file);
	}
	
	public void remove(AbstractFile file) {
		list.remove(file);
	}
	
	public AbstractFile getChild(int index) {
		return list.get(index);
	}
}
