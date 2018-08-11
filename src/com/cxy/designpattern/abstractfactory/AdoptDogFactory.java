package com.cxy.designpattern.abstractfactory;

import com.cxy.designpattern.abstractfactory.product.DogHouse;
import com.cxy.designpattern.abstractfactory.product.House;
import com.cxy.designpattern.polymorphicfactory.BaseFactory;
import com.cxy.designpattern.polymorphicfactory.DogFactory;
import com.cxy.designpattern.polymorphicfactory.product.Pet;

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
