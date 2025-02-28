package com.cy.leetcodeplay.array.no728;

import com.alibaba.fastjson2.JSONArray;
import com.cy.leetcodeplay.array.no728.Solution;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class SolutionTest {

    private Solution solution = new Solution();

    @Test
    public void test1() {
        int left = 1;
        int right = 22;

        List<Integer> list = solution.selfDividingNumbers(left, right);
        String res1 = JSONArray.toJSONString(list);
        System.out.println(res1);

        Assertions.assertEquals("[1,2,3,4,5,6,7,8,9,11,12,15,22]", res1);
    }

    @Test
    public void test2() {
        int left = 47;
        int right = 85;

        List<Integer> list = solution.selfDividingNumbers(left, right);
        String res1 = JSONArray.toJSONString(list);
        System.out.println(res1);

        Assertions.assertEquals("[48,55,66,77]", res1);
    }
}