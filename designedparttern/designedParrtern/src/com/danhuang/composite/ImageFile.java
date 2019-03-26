package com.danhuang.composite;

/**
 * ��ͼƬ�ļ�����ɱ�����൱��Ҷ��
 * @author danhuang
 *
 */
public class ImageFile implements AbstractFile{
	
	private String name;
	
	public ImageFile(String name) {
		super();
		this.name = name;
	}

	@Override
	public void killVirus() {
		System.out.println("ͼ���ļ�"+name+",���в�ɱ��");
	}
}
