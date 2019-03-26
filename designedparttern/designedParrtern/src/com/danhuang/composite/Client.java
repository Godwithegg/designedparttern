package com.danhuang.composite;

/**
 * 组合模式
 * 树形结构用到组合模式，自带递归功能，应用：例如资源管理器，这里我们模拟一个杀毒软件
 * @author danhuang
 *
 */
public class Client {
	public static void main(String[] args) {
		AbstractFile f2,f3,f4,f5;
		Folder f1 = null;
		f1 = new Folder("我的收藏");
		f2 = new ImageFile("老高的大头像.jpg");
		f3 = new TextFile("Hello.txt");
		
		f1.add(f2);
		f1.add(f3);
//		f1.killVirus();
		
		Folder f11 = new Folder("我的电影");
		f4 = new VidioFile("海贼王.avi");
		f5 = new VidioFile("火影忍者.avi");
		f11.add(f4);
		f11.add(f5);
		f1.add(f11);
		f1.killVirus();
	}
}
