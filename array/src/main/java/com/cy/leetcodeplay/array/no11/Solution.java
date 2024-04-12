package com.cy.leetcodeplay.array.no11;

/**
 * @Author: Lil-K
 * @Date: 2024/4/11
 * @Description: no.11 Container With Most Water
 *
 * 决定容积的因变量是 指定范围内 最短的一边, 然后缩小范围, 在缩小的过程中如果还有更大的, 就替换这个值, 使用对撞指针
 */
public class Solution {

    public static int maxArea(int[] height) {
        int l = 0, r = height.length - 1;
        int maxArea = 0;

        while (l < r) {
            int gap = r - l;
            int currentArea = gap * Math.min(height[l], height[r]);

            maxArea = Math.max(maxArea, currentArea);

            if (height[l] < height[r]) {
                l ++;
            }else {
                r --;
            }
        }

        return maxArea;
    }


}