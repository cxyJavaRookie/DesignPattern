package com.cxy.designpattern.factory.abstractfactory;


import com.cxy.designpattern.factory.simpfactory.product.Dog;

public class Client {

    public static void main(String[] args) {

        AdoptPet AdoptPet = new AdoptPet();

        AbstractFactory abstractFactory = new AdoptDogFactory();
        AdoptPet.adoptPet(abstractFactory, Dog.DOG_TYPE_SIBERIANHUSKY);
    }

}
