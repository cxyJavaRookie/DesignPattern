package com.cxy.designpattern.factory.polymorphicfactory.product;

public class Garfield implements Cat {

    @Override
    public void jump() {
        System.out.println("加菲猫 ： 闹什么闹  。。");
    }

    @Override
    public void bark() {
        System.out.println("加菲猫 ：  谬 。。");
    }

    @Override
    public void eat() {
        System.out.println("加菲猫 ： 不吃了 好胖了  。。");
    }
}
