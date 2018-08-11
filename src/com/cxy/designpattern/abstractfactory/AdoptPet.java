package com.cxy.designpattern.abstractfactory;

import com.cxy.designpattern.abstractfactory.product.House;
import com.cxy.designpattern.polymorphicfactory.product.Pet;

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
