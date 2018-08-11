package com.cxy.designpattern.polymorphicfactory;

import com.cxy.designpattern.polymorphicfactory.product.Pet;
import com.cxy.designpattern.simpfactory.SimpFactory;
import com.cxy.designpattern.simpfactory.product.Dog;
import com.cxy.designpattern.simpfactory.product.GoldenHair;
import com.cxy.designpattern.simpfactory.product.SiberianHusky;

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
