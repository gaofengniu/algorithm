package com.casic.algorithm;

/**
 * 插入排序算法
 * Insertion
 *           平均   最坏  最好
 * 时间复杂度：O(n²) O(n²) n
 * 空间复杂度：O(1)
 * 稳定性： 稳
 * @date 2020年03月24日10:22:22
 * @author niugaofeng
 */
public class InsertionSort {

    public static void main(String[] args) {

        int[] a = {9,3,5,4,7,6,1,8,2};
        sort(a);
        Utils.print(a);
    }

    /**
     * 插入算法
     * @param a
     */
    public static void sort(int[] a){
        for (int i = 1; i < a.length; i++) {
           insert(a,i);
        }
    }

    private static void insert(int[] a, int n){
        for(int j=n;j>0 && a[j-1]>a[j];j--){
            Utils.swap(a,j-1,j);
        }
    }
}
