package com.cxy.designpattern.factory.abstractfactory;

import com.cxy.designpattern.factory.abstractfactory.product.House;
import com.cxy.designpattern.factory.polymorphicfactory.product.Pet;

public interface AbstractFactory {

    Pet createPet(int petType);
    House createHouse();
}
