package com.danhuang.composite;

/**
 * 对图片文件进行杀毒，相当于叶子
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
		System.out.println("图像文件"+name+",进行查杀！");
	}
}
