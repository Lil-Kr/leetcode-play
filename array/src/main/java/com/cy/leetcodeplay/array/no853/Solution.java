package com.cy.leetcodeplay.array.no853;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @Author: Lil-K
 * @Date: 2024/8/31
 * @Description: no.853. Car Fleet
 */
public class Solution {

	public static int carFleet(int target, int[] position, int[] speed) {
		if (position.length == 1) {
			return position.length;
		}

		int n = position.length;

		// 创建一个二维数组存储位置和到达时间
		double[][] cars = new double[n][2];
		for (int i = 0; i < n; i++) {
			cars[i][0] = position[i];
			cars[i][1] = (double) (target - position[i]) / speed[i];
		}

		// 按位置从大到小排序
		Arrays.sort(cars, Comparator.comparingDouble(a -> -a[0]));

		int fleets = 0;
		double lastTime = 0;

		// 遍历每辆车的到达时间
		for (int i = 0; i < n; i++) {
			double currentTime = cars[i][1];
			/**
			 * 如果当前车的到达时间比前一车的时间晚, 形成一个新的车队
			 * 快车一定会追上慢车, 时间慢的一定追不上
			 */
			if (currentTime > lastTime) {
				fleets++;
				lastTime = currentTime;
			}
		}

		return fleets;
	}
}
