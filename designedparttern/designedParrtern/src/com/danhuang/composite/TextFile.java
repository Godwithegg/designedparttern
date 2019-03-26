package com.danhuang.composite;

/**
 * ���ı��ļ�����ɱ�����൱��Ҷ��
 * @author danhuang
 *
 */
public class TextFile implements AbstractFile{
	
	private String name;
	
	public TextFile(String name) {
		super();
		this.name = name;
	}

	@Override
	public void killVirus() {
		System.out.println("�ı��ļ�"+name+",����ɱ����");
	}
}
