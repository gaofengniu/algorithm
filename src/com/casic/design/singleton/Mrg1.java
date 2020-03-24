package com.casic.design.singleton;

/**
 * @author niugaofeng
 */
public class Mrg1 {

    private static  final Mrg1 instance = new Mrg1();

    private Mrg1(){}

    public static Mrg1 getInstance(){ return instance; };
}
