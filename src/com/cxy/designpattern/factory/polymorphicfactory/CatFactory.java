package com.cxy.designpattern.factory.polymorphicfactory;

import com.cxy.designpattern.factory.polymorphicfactory.product.Cat;
import com.cxy.designpattern.factory.polymorphicfactory.product.Garfield;
import com.cxy.designpattern.factory.polymorphicfactory.product.Pet;
import com.cxy.designpattern.factory.polymorphicfactory.product.Ragdoll;

public class CatFactory implements BaseFactory {

    @Override
    public Pet factory(int catType) {

        if(Cat.CAT_TYPE_RAGDOLL == catType ){
            return new Ragdoll();
        }else if(Cat.CAT_TYPE_GARFIELD == catType){
            return new Garfield();
        }
        throw new RuntimeException("没有合适的猫宠物咪");
    }
}
