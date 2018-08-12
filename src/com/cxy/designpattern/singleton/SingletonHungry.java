package com.cxy.designpattern.singleton;

/**
 * 饿汉式
 */
public class SingletonHungry {

    private static SingletonHungry singletonHungry = new SingletonHungry();

    private SingletonHungry(){};

    public SingletonHungry getSingletonHungry(){
        return singletonHungry;
    }
}
