package com.cxy.designpattern.factory.abstractfactory;

import com.cxy.designpattern.factory.abstractfactory.product.House;
import com.cxy.designpattern.factory.polymorphicfactory.product.Pet;

public class AdoptPet {

    private Pet pet;
    private House house;

    public void adoptPet(AbstractFactory af, int petType){

        pet = af.createPet(petType);
        pet.eat();
        house = af.createHouse();
        house.buildingHouse();
    }
}
