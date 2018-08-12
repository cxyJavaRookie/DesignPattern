package com.cxy.designpattern.singleton;

public class SingletonLazySynchroized1 {

    private volatile static SingletonLazySynchroized1 singletonLazySynchroized1 = new SingletonLazySynchroized1();

    private SingletonLazySynchroized1(){};

    public SingletonLazySynchroized1 getSingletonLazySynchroized1(){

        if(singletonLazySynchroized1 == null){
            synchronized (this){
                singletonLazySynchroized1 = new SingletonLazySynchroized1();
            }
        }
        return singletonLazySynchroized1;
    }

}
