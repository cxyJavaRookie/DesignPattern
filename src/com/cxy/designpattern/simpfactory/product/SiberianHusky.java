package com.cxy.designpattern.simpfactory.product;

/**
 *
 * @author chenxingyu
 */
public class SiberianHusky implements Dog {

	@Override
	public void bark() {
		System.out.println("哈士奇 叫 : 啊啦啦啦啦啦啦");
	}

	@Override
	public void eat() {
		System.out.println("哈士奇 吃 : 都让开 都是我的");
	}

}
