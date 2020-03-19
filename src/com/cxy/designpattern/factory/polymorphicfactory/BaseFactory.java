package com.cxy.designpattern.factory.polymorphicfactory;


import com.cxy.designpattern.factory.polymorphicfactory.product.Pet;

public interface BaseFactory {

    Pet factory(int type);

}
