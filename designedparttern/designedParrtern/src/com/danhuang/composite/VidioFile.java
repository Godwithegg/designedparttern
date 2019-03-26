package com.danhuang.composite;

/**
 * 对视频文件进行杀毒，相当于叶子
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
		System.out.println("视频文件"+name+",进行杀毒！");
	}
}
