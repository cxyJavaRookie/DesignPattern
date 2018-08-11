package com.cxy.designpattern.polymorphicfactory.product;

public class Ragdoll implements Cat {

    @Override
    public void jump() {
        System.out.println("布偶猫 ： 我就要闹 。。");
    }

    @Override
    public void bark() {
        System.out.println("布偶猫 ： 阿嚏 。。");
    }

    @Override
    public void eat() {
        System.out.println("布偶猫 ： 我也不吃了 。。");
    }
}
