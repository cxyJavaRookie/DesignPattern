package com.cxy.designpattern.simpfactory.product;

import com.cxy.designpattern.polymorphicfactory.product.Pet;

/**
 *
 * @author chenxingyu
 */
public interface Dog  extends Pet {

	int DOG_TYPE_SIBERIANHUSKY = 1;     //哈士奇
	int DOG_TYPE_GOLDENHAIR = 2;        //金毛

	void bark();
	void eat();
}
