package com.cxy.designpattern.factory.polymorphicfactory;

import com.cxy.designpattern.factory.polymorphicfactory.product.Pet;
import com.cxy.designpattern.factory.simpfactory.product.Dog;
import com.cxy.designpattern.factory.simpfactory.product.GoldenHair;
import com.cxy.designpattern.factory.simpfactory.product.SiberianHusky;

public class DogFactory implements BaseFactory {

    @Override
    public Pet factory(int dogType) {

        if(Dog.DOG_TYPE_SIBERIANHUSKY == dogType) {
            return new SiberianHusky();
        }else if(Dog.DOG_TYPE_GOLDENHAIR == dogType){
            return new GoldenHair();
        }
        throw new RuntimeException("没有合适的宠物狗狗");
    }
}
