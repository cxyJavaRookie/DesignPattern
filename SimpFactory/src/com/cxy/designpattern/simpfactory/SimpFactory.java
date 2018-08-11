package com.cxy.designpattern.simpfactory;

import com.cxy.designpattern.product.Dog;
import com.cxy.designpattern.product.GoldenHair;
import com.cxy.designpattern.product.SiberianHusky;
/**
 *
 * @author chenxingyu
 */
public class SimpFactory {

    public static final int DOG_TYPE_SIBERIANHUSKY = 1;
    public static final int DOG_TYPE_GOLDENHAIR = 2;

    public static Dog getGog(int dogType){

        if(dogType == DOG_TYPE_SIBERIANHUSKY ){
            return new SiberianHusky();
        }else if (dogType == DOG_TYPE_GOLDENHAIR) {
            return new GoldenHair();
        }

        throw new RuntimeException("没有合适类型的实例");
    }
}
