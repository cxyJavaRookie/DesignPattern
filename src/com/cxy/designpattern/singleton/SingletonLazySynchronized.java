package com.cxy.designpattern.singleton;

public class SingletonLazySynchronized {

    private static SingletonLazySynchronized singletonLazySynchronized = new SingletonLazySynchronized();

    private SingletonLazySynchronized(){};

    public synchronized SingletonLazySynchronized getSingletonLazySynchronized(){

        if(singletonLazySynchronized == null){

            singletonLazySynchronized = new SingletonLazySynchronized();
        }

        return singletonLazySynchronized;
    }
}
