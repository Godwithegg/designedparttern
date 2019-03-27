package com.danhuang.proxy.staticproxy;

/**
 * æ≤Ã¨¥˙¿Ì≤‚ ‘
 * @author danhuang
 *
 */
public class Client {
	public static void main(String[] args) {
		Star real = new RealStar();
		Star proxy = new ProxyStar(real);
		proxy.confer();
		proxy.signContract();
		proxy.bookTicket();
		proxy.sing();
		proxy.collectMoney();
	}
}
