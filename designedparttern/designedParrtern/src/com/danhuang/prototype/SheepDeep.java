package com.danhuang.prototype;

import java.util.Date;

/**
 * ��¡�����,���¡ʵ��
 * 
 * @author danhuang
 *
 */
public class SheepDeep implements Cloneable {
	private String sname;
	private Date birthday;

	@Override
	protected Object clone() throws CloneNotSupportedException {
		Object obj = super.clone(); // ֱ�ӵ���object�����clone����

		// ������´���ʵ�����¡(deep clone)
		SheepDeep s = (SheepDeep) obj;
		s.birthday = (Date) this.birthday.clone();
		// s.sname = (String) this.sname.cl;
		return obj;
	}

	public SheepDeep() {
	}

	public SheepDeep(String sname, Date birthday) {
		this.sname = sname;
		this.birthday = birthday;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

}
