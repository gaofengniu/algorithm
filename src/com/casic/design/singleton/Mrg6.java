package com.casic.design.singleton;

/**
 * @author niugaofeng
 */
public class Mrg6 {

    private static volatile Mrg6 instance;

    private Mrg6(){}

    public static Mrg6 getInstance(){

        if (instance == null){

            synchronized (Mrg6.class){
                if(instance == null){
                    instance = new Mrg6();
                }
            }
        }

        return instance;
    }
}
