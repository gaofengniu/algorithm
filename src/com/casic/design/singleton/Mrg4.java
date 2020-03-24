package com.casic.design.singleton;

/**
 * @author niugaofeng
 */
public class Mrg4 {

    private static Mrg4 instance;

    private Mrg4(){}

    public static Mrg4 getInstance(){

        if (instance == null){

            synchronized (Mrg4.class){
                instance = new Mrg4();
            }
        }

        return instance;
    }
}
