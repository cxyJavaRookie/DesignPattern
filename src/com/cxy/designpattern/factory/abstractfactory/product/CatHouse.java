package com.cxy.designpattern.factory.abstractfactory.product;

public class CatHouse implements House {

    @Override
    public void buildingHouse() {
        System.out.println("得到一个猫舍 。");
    }
}
