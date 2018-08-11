package com.cxy.designpattern.abstractfactory;

import com.cxy.designpattern.abstractfactory.product.House;
import com.cxy.designpattern.polymorphicfactory.product.Pet;

public interface AbstractFactory {

    Pet createPet(int petType);
    House createHouse();
}
