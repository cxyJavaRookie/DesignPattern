package com.cxy.designpattern.abstractfactory;

import com.cxy.designpattern.polymorphicfactory.product.Cat;
import com.cxy.designpattern.simpfactory.product.Dog;

public class Client {

    public static void main(String[] args) {

        AdoptPet AdoptPet = new AdoptPet();

        AbstractFactory abstractFactory = new AdoptDogFactory();
        AdoptPet.adoptPet(abstractFactory, Dog.DOG_TYPE_SIBERIANHUSKY);
    }

}
