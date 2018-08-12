package com.cxy.designpattern.singleton;

public class SingletonInternalClass {

    private SingletonInternalClass(){}

    private static class SingletonInternal{

      private static SingletonInternalClass singletonInternalClass = new SingletonInternalClass();

    }

    public SingletonInternalClass getSingletonInternalClass(){
        return SingletonInternal.singletonInternalClass;
    }

}
