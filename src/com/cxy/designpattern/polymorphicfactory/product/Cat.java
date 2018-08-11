package com.cxy.designpattern.polymorphicfactory.product;

public interface Cat extends Pet{

    int CAT_TYPE_RAGDOLL = 1;           //布偶
    int CAT_TYPE_GARFIELD = 2;          //加菲

    void jump();
}
