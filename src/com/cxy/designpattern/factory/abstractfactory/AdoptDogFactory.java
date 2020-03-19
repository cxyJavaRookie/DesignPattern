package com.cxy.designpattern.factory.abstractfactory;

import com.cxy.designpattern.factory.abstractfactory.product.DogHouse;
import com.cxy.designpattern.factory.abstractfactory.product.House;
import com.cxy.designpattern.factory.polymorphicfactory.BaseFactory;
import com.cxy.designpattern.factory.polymorphicfactory.DogFactory;
import com.cxy.designpattern.factory.polymorphicfactory.product.Pet;

public class AdoptDogFactory implements AbstractFactory {

    @Override
    public Pet createPet(int dogType) {

        BaseFactory baseFactory = new DogFactory();
        return baseFactory.factory(dogType);
    }

    @Override
    public House createHouse() {
        return new DogHouse();
    }

}
