package com.danhuang.composite;

/**
 * 对文本文件进行杀毒，相当于叶子
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
		System.out.println("文本文件"+name+",进行杀毒！");
	}
}
