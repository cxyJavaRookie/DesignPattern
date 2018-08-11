package com.cxy.designpattern.simpfactory;


import com.cxy.designpattern.simpfactory.product.Dog;
import com.cxy.designpattern.simpfactory.product.GoldenHair;
import com.cxy.designpattern.simpfactory.product.SiberianHusky;

/**
 *
 * @author chenxingyu
 */
public class SimpFactory {


    public static Dog getGog(int dogType){

        if(dogType == Dog.DOG_TYPE_SIBERIANHUSKY ){
            return new SiberianHusky();
        }else if (dogType == Dog.DOG_TYPE_GOLDENHAIR) {
            return new GoldenHair();
        }

        throw new RuntimeException("没有合适类型的实例");
    }
}
