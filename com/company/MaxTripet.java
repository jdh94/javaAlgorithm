package com.company;

import java.util.Arrays;

public class MaxTripet {
    public static void main(String[] args) {
        int[] A = new int[6];
        A[0] = -3;
        A[1] = 1;
        A[2] = 2;
        A[3] = -2;
        A[4] = 5;
        A[5] = 6;

        System.out.println(solution10(A));
    }

    public static int solution10(int[] A) {
        // write your code in Java SE 8
        Arrays.sort(A);
        int size = A.length;

        int max = Math.max(A[0]*A[1]*A[size-1], A[size-1]*A[size-2]*A[size-3]);

        return max;
    }
}
