package com.cxy.designpattern.factory.abstractfactory;

import com.cxy.designpattern.factory.abstractfactory.product.CatHouse;
import com.cxy.designpattern.factory.abstractfactory.product.House;
import com.cxy.designpattern.factory.polymorphicfactory.BaseFactory;
import com.cxy.designpattern.factory.polymorphicfactory.CatFactory;
import com.cxy.designpattern.factory.polymorphicfactory.product.Pet;

public class AdoptCatFactory implements AbstractFactory {


    @Override
    public Pet createPet(int catType) {

        BaseFactory baseFactory = new CatFactory();
        return baseFactory.factory(catType);
    }

    @Override
    public House createHouse() {
        return new CatHouse();
    }
}
