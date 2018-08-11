package com.cxy.designpattern.simpfactory;


import com.cxy.designpattern.simpfactory.product.Dog;

/**
 *
 * @author chenxingyu
 */
public class Client {
		
	public static void main(String[] args) {
		Dog dog = SimpFactory.getGog(Dog.DOG_TYPE_SIBERIANHUSKY);
		dog.bark();
		dog.eat();
	}
}
