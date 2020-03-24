package com.casic.design.singleton;

/**
 * @author niugaofeng
 */
public class Mrg3 {

    private static Mrg3 instance;

    private Mrg3(){}

    public static synchronized Mrg3 getInstance(){

        if(instance == null){
            instance = new Mrg3();
        }

        return instance;
    }
}
