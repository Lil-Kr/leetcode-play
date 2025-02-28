package com.cy.leetcodeplay.matrix.common.util;

/**
 * @Author: Lil-K
 * @Date: 2023/8/23
 * @Description: 生成数字工具类
 */
public class NumberUtil {

    /**
     * 生成指定范围内的整数数组
     * @param n
     * @param rangeL
     * @param rangeR
     * @return
     */
    public static Integer[] generateRandomArray(int n, int rangeL, int rangeR) {
        assert n > 0 && rangeL <= rangeR;

        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++)
            arr[i] = new Integer((int)(Math.random() * (rangeR - rangeL + 1) + rangeL));
        return arr;
    }

    /**
     * 生成顺序的整形数组
     * @param n
     * @return
     */
    public static Comparable[] generateOrderedArray(int n) {
        assert n > 0;

        Comparable[] arr = new Comparable[n];
        for (int i = 0; i < n; i++)
            arr[i] = i;
        return arr;
    }


    /**
     * 生成一个近乎有序的数组
     * 首先生成一个含有[0...n-1]的完全有序数组, 之后随机交换swapTimes对数据
     * swapTimes定义了数组的无序程度:
     * swapTimes == 0 时, 数组完全有序
     * swapTimes 越大, 数组越趋向于无序
     * @param n
     * @param swapTimes
     * @return
     */
    public static Integer[] generateNearlyOrderedArray(int n, int swapTimes){

        Integer[] arr = new Integer[n];
        for( int i = 0 ; i < n ; i ++ )
            arr[i] = new Integer(i);

        for( int i = 0 ; i < swapTimes ; i ++ ) {
            int a = (int)(Math.random() * n);
            int b = (int)(Math.random() * n);
            int t = arr[a];
            arr[a] = arr[b];
            arr[b] = t;
        }
        return arr;
    }
}
