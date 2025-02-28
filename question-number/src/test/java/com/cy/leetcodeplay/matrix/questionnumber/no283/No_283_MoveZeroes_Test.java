package com.cy.leetcodeplay.matrix.questionnumber.no283;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

@Slf4j
class No_283_MoveZeroes_Test {

    private static No_283_MoveZeroes moveZeroes = new No_283_MoveZeroes();

    @Test
    public void test_moveZeroes_1_1() {
        int[] nums = {0,1,0,3,12};
        moveZeroes.moveZeroes_1(nums);
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < nums.length; i++) {
            sb.append(nums[i] + ",");
        }
        sb.replace(0, sb.length(), StringUtils.removeEnd(sb.toString(),","));
        sb.append("]");
        System.out.println(sb);
        Assertions.assertEquals("[1,3,12,0,0]", sb.toString());
    }

    @Test
    public void test_moveZeroes_1_2() {
        int[] nums = {0};
        moveZeroes.moveZeroes_1(nums);
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < nums.length; i++) {
            sb.append(nums[i] + ",");
        }
        sb.replace(0, sb.length(), StringUtils.removeEnd(sb.toString(),","));
        sb.append("]");
        System.out.println(sb);
        Assertions.assertEquals("[0]", sb.toString());
    }

    @Test
    public void test_moveZeroes_2_1() {
        int[] nums = {0,1,0,3,12};
        moveZeroes.moveZeroes_2(nums);
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < nums.length; i++) {
            sb.append(nums[i] + ",");
        }
        sb.replace(0, sb.length(), StringUtils.removeEnd(sb.toString(),","));
        sb.append("]");
        System.out.println(sb);
        Assertions.assertEquals("[1,3,12,0,0]", sb.toString());
    }

    @Test
    public void test_moveZeroes_2_2() {
        int[] nums = {0};
        moveZeroes.moveZeroes_2(nums);
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < nums.length; i++) {
            sb.append(nums[i] + ",");
        }
        sb.replace(0, sb.length(), StringUtils.removeEnd(sb.toString(),","));
        sb.append("]");
        System.out.println(sb);
        Assertions.assertEquals("[0]", sb.toString());
    }

    @Test
    public void test_moveZeroes_3_1() {
        int[] nums = {0,1,0,3,12};
        moveZeroes.moveZeroes_3(nums);
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < nums.length; i++) {
            sb.append(nums[i] + ",");
        }
        sb.replace(0, sb.length(), StringUtils.removeEnd(sb.toString(),","));
        sb.append("]");
        System.out.println(sb);
        Assertions.assertEquals("[1,3,12,0,0]", sb.toString());
    }

    @Test
    public void test_moveZeroes_3_2() {
        int[] nums = {0};
        moveZeroes.moveZeroes_3(nums);
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < nums.length; i++) {
            sb.append(nums[i] + ",");
        }
        sb.replace(0, sb.length(), StringUtils.removeEnd(sb.toString(),","));
        sb.append("]");
        System.out.println(sb);
        Assertions.assertEquals("[0]", sb.toString());
    }

    @Test
    public void test_moveZeroes_3_3() {
        int[] nums = {0,0,0,0,0};
        moveZeroes.moveZeroes_3(nums);
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < nums.length; i++) {
            sb.append(nums[i] + ",");
        }
        sb.replace(0, sb.length(), StringUtils.removeEnd(sb.toString(),","));
        sb.append("]");
        System.out.println(sb);
        Assertions.assertEquals("[0,0,0,0,0]", sb.toString());
    }
}