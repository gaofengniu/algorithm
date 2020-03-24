package com.casic.design.singleton;

/**
 * @author niugaofeng
 */
public class Mrg5 {

    private static Mrg5 instance;

    private Mrg5(){}

    public static Mrg5 getInstance(){

        if (instance == null){

            synchronized (Mrg5.class){
                if(instance == null){
                    instance = new Mrg5();
                }
            }
        }

        return instance;
    }
}
