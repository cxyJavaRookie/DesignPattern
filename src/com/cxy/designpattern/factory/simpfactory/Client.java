package com.cxy.designpattern.factory.simpfactory;


import com.cxy.designpattern.factory.simpfactory.product.Dog;

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
