package com.casic.algorithm;

/**
 * @author niugaofeng
 */
public class Utils {

    /**
     * 交换数组位置
     * @param a
     * @param i
     * @param j
     */
    public static void swap(int[] a,int i,int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    /**
     * 打印数组
     * @param a
     */
    public static void print(int[] a){
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }
}
