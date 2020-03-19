package com.cxy.designpattern.factory.polymorphicfactory;


import com.cxy.designpattern.factory.polymorphicfactory.product.Pet;

public class Client {

    public static void main(String[] args) {
        BaseFactory baseFactory = new DogFactory();
        Pet factory = baseFactory.factory(2);
        factory.bark();
        factory.eat();
    }

}
