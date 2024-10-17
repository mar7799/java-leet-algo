package org.example;

public class Triplet {
    public static void main(String[] args) {
        int[] a = {20,100,10,12,5,13};
        System.out.println(isTriplet(a));
    }

    private static boolean isTriplet(int[] a) {
        boolean isTriplet = false;
//        int i = 0;
        for (int i = 0; i < a.length; i++) {
            if(i < a.length - 2) {
                if (a[i] < a[i + 1] && a[i + 1] < a[i + 2]) {
                    isTriplet = true;
                    break;
                }
            }
        }
        return isTriplet;
    }
}
