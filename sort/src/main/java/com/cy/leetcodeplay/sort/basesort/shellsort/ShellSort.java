package com.cy.leetcodeplay.sort.basesort.shellsort;

/**
 * @Author: Lil-K
 * @Date: 2023/8/27
 * @Description: 希尔排序
 */
public class ShellSort {

    public static void main(String[] args) {
        Comparable[] arr = new Comparable[]{3, 2, 6, 1, 9, 5, 22, 7, 60};
        int length = arr.length;
        int h = 1;

        while (h < length / 3)
            h = 3 * h + 1;

        System.out.println(h);
    }

}