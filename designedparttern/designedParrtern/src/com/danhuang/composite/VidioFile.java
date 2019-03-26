package com.danhuang.composite;

/**
 * ����Ƶ�ļ�����ɱ�����൱��Ҷ��
 * @author danhuang
 *
 */
public class VidioFile implements AbstractFile{
	
	private String name;
	
	public VidioFile(String name) {
		super();
		this.name = name;
	}

	@Override
	public void killVirus() {
		System.out.println("��Ƶ�ļ�"+name+",����ɱ����");
	}
}
