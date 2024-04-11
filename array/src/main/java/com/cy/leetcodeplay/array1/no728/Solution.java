package com.cy.leetcodeplay.array1.no728;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Lil-K
 * @Date: 2024/3/6
 * @Description: Self Dividing Numbers
 *
 * A self-dividing number is a number that is divisible by every digit it contains.
 *
 * For example, 128 is a self-dividing number because 128 % 1 == 0, 128 % 2 == 0, and 128 % 8 == 0.
 * A self-dividing number is not allowed to contain the digit zero.
 *
 * Given two integers left and right, return a list of all the self-dividing numbers in the range [left, right].
 *
 */
public class Solution {

    public List<Integer> selfDividingNumbers(int left, int right) {

        List<Integer> res = new ArrayList<>();

        for (int i = left; i <= right ; i++) {
            if (check2(i)) {
                res.add(i);
            }
        }
        return res;
    }

    /**
     * 复杂度: O(n^2)
     * @param number
     * @return
     */
    public boolean check1(Integer number) {
        char[] charArray = String.valueOf(number).toCharArray();

        boolean res = true;

        for (char c : charArray) {
            if ("0".equals(String.valueOf(c))) return false;

            if ((number % Integer.valueOf(String.valueOf(c))) == 0) {
                res = true;
            } else {
                return false;
            }
        }
        return res;
    }

    /**
     * 复杂度 O(n)
     * 利用 取余 和 整型除法的概念, 依次比较每一位上的数字
     * @param number
     * @return
     */
    public boolean check2(Integer number) {
        int tempNumber = number;

        while (number != 0) {
            int r = number % 10;

            if (r == 0) return false;

            if (tempNumber % r != 0) {
                return false;
            }
            number = number / 10; // (整数 / 10) 取整数部分
        }

        return true;
    }

}
