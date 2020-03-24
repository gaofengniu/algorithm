package com.casic.algorithm;

/**
 * 冒泡排序
 * Bubble
 *           平均   最坏  最好
 * 时间复杂度：O(n²) O(n²) n
 * 空间复杂度：O(1)
 * 稳定性： 稳
 * @date 2020年03月24日10:22:22
 * @author niugaofeng
 */
public class BubbleSort {

    public static void main(String[] args) {
      int[] a = {9,3,5,4,7,6,1,8,2};
      sort(a);
      Utils.print(a);
    }

   public static void sort(int[] a){
        for (int i = a.length-1; i >0 ; i--) {
            findMax(a,i);
        }
    }

   private static void findMax(int[] a,int n){
        for (int j = 0;j<n;j++ ){
            if(a[j]>a[j+1]){
                Utils.swap(a,j,j+1);
            }
        }
    }


}
