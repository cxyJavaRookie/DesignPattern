package com.cxy.designpattern.simpfactory;

import com.cxy.designpattern.product.Dog;

/** 
 *
 * @author chenxingyu
 */
public class Client {
		
	public static void main(String[] args) {
		Dog dog = SimpFactory.getGog(SimpFactory.DOG_TYPE_SIBERIANHUSKY);
		dog.bark();
		dog.eat();
	}
}
