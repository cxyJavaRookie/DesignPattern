package com.cxy.designpattern.abstractfactory;

import com.cxy.designpattern.abstractfactory.product.CatHouse;
import com.cxy.designpattern.abstractfactory.product.House;
import com.cxy.designpattern.polymorphicfactory.BaseFactory;
import com.cxy.designpattern.polymorphicfactory.CatFactory;
import com.cxy.designpattern.polymorphicfactory.product.Pet;

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
