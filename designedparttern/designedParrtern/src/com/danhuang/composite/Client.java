package com.danhuang.composite;

/**
 * ���ģʽ
 * ���νṹ�õ����ģʽ���Դ��ݹ鹦�ܣ�Ӧ�ã�������Դ����������������ģ��һ��ɱ�����
 * @author danhuang
 *
 */
public class Client {
	public static void main(String[] args) {
		AbstractFile f2,f3,f4,f5;
		Folder f1 = null;
		f1 = new Folder("�ҵ��ղ�");
		f2 = new ImageFile("�ϸߵĴ�ͷ��.jpg");
		f3 = new TextFile("Hello.txt");
		
		f1.add(f2);
		f1.add(f3);
//		f1.killVirus();
		
		Folder f11 = new Folder("�ҵĵ�Ӱ");
		f4 = new VidioFile("������.avi");
		f5 = new VidioFile("��Ӱ����.avi");
		f11.add(f4);
		f11.add(f5);
		f1.add(f11);
		f1.killVirus();
	}
}
