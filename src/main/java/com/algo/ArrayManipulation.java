package com.algo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/*
Problem : https://www.hackerrank.com/challenges/crush/problem
 */
public class ArrayManipulation {
    public static long arrayManipulation(int n, List<List<Integer>> arr){
        long res[] = new long[n+2];
        for (List<Integer> e: arr){
            int start = e.get(0);
            int end = e.get(1);
            int value = e.get(2);

            res[start] += value;
            res[end+1] -= value;
        }

        long curr=0, max =0;
        for (int i=1;i<=n;i++){
            curr += res[i];
            max = Math.max(curr,max);
        }
        return max;
    }

    public static void main(String[] args) {
        int n = 10;
        List<List<Integer>> arr = new ArrayList<>(Arrays.asList(
                new ArrayList<>(Arrays.asList(1,5,3)),
                new ArrayList<>(Arrays.asList(4,8,7)),
                new ArrayList<>(Arrays.asList(6,9,1))));

        System.out.println(arrayManipulation(n,arr));

    }
}
