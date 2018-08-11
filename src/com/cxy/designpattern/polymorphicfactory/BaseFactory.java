package com.cxy.designpattern.polymorphicfactory;

import com.cxy.designpattern.polymorphicfactory.product.Pet;

public interface BaseFactory {

    Pet factory(int type);

}
