package com.casic.design.singleton;

/**
 * @author niugaofeng
 */
public class Mrg2 {

    private static Mrg2 instance;

    private Mrg2(){}

    public static Mrg2 getInstance(){

        if(instance == null ){
            instance = new Mrg2();
        }

        return instance;
    }
}
