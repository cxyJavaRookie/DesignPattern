package com.cxy.designpattern.factory.simpfactory.product;

/**
 *
 * @author chenxingyu
 */
public class GoldenHair implements Dog {

	@Override
	public void bark() {
		System.out.println("金毛叫 : 他就是个傻逼");
	}

	@Override
	public void eat() {
		System.out.println("金毛吃 : 吃吧 吃死你");
	}

}
