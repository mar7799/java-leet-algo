package org.example;

import java.lang.reflect.Array;
import java.util.Arrays;

public class product {
    public  static void main(String[] args) {
        int[] arr = new int[]{-1,1,0,-3,3};
        System.out.println(Arrays.toString(findProducts(arr)));
    }

    public static int[] findProducts(int[] arr){
        int[] arr2 = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            int prod = 1;
            for(int j = 0; j < arr.length; j++){
                if(i == j){
                    continue;
                }
                else{
                    prod *= arr[j];
                }
            }
            arr2[i] = prod;
        }
        return arr2;
    }
}
