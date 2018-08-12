package com.cxy.designpattern.singleton;

/**
 * 懒汉式
 */
public class SingletonLazy {

    private static SingletonLazy singletonLazy = new SingletonLazy();

    private SingletonLazy(){};

    public SingletonLazy getSingletonLazy(){

        if(singletonLazy == null){

            singletonLazy = new SingletonLazy();
        }

        return singletonLazy;
    }
}
