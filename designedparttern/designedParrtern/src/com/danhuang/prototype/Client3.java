package com.danhuang.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

/**
 * 序列化实现深克隆
 * @author danhuang
 *
 */
public class Client3 {
	public static void main(String[] args) throws Exception {
		
		Sheep sheep1 = new Sheep();
		sheep1.setBirthday(new Date());
		System.out.println(sheep1.getBirthday());
		
		//使用序列化和反序列化实现深复制
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		oos.writeObject(sheep1);
		byte[] bytes = bos.toByteArray();
		
		ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
		ObjectInputStream ois = new ObjectInputStream(bis);
		Sheep sheep2 = (Sheep) ois.readObject();
		
		sheep1.setBirthday(new Date(1999999999));
		System.out.println("修改后：");
		System.out.println(sheep1.getBirthday());
		System.out.println(sheep2.getBirthday());
	}
}
