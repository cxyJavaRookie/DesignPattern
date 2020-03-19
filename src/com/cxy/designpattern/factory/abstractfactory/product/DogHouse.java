package com.cxy.designpattern.factory.abstractfactory.product;


public class DogHouse implements House {

    @Override
    public void buildingHouse() {
        System.out.println("得到一个狗舍 。");
    }
}
