package com.cy.leetcodeplay.questionnumber.no1;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: Lil-K
 * @Date: 2023/9/14
 * @Description: No-1 Two_Sum
 */
public class No_1_TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        if (null == nums)
            return new int[]{};

        Map<Integer, Integer> record = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int temp = target - nums[i];
            if (record.containsKey(temp)) {
                return new int[]{i, record.get(temp)};
            }
            record.put(nums[i], i);
        }
        return new int[]{};
    }

}
