package com.casic.design.factory;

public class Son extends Father {
    private int i = test();


    static {
        System.out.print("(6)");
    }
    private static  int j = method();
    Son(){
        System.out.print("(7)");
    }
    {
        System.out.print("(8)");
    }
    @Override
    public int test(){
        System.out.print("(9)");
        return 1;
    }

    public static int method(){
        System.out.print("(10)");
        return 1;
    }

    public static void main(String[] args) {
        Son s1=new Son();
        System.out.println();
        Son s2=new Son();
    }
}
