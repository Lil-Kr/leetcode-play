package com.cy.leetcodeplay.array.no380;

import java.util.*;

/**
 * @Author: Lil-K
 * @Date: 2025/4/10
 * @Description: no.380. Insert Delete GetRandom O(1)
 * link: https://leetcode.com/problems/insert-delete-getrandom-o1
 *
 * 题目要求O(1)级别的复杂度, 基本考虑哈希表和数组
 *  使用map存储元素对应的索引
 *  删除时:
 *    1. 先获取待删除元素的索引位置
 *    2. 讲待删除的位置使用最后一个元素来覆盖
 *    3. 删除最后一个元素, 同 map中的元素一并删除
 */
public class RandomizedSet {

	// 存储元素及其在列表中的索引
	private Map<Integer, Integer> map;

	// 存储元素
	private List<Integer> list;

	// 用于生成随机数
	private Random random;

	public RandomizedSet() {
		map = new HashMap<>();
		list = new ArrayList<>();
		random = new Random();
	}

	public boolean insert(int val) {
		if (map.containsKey(val)) {
			return false;
		}
		// 索引从0开始
		map.put(val, list.size());
		list.add(val);
		return true;
	}

	public boolean remove(int val) {
		if (!map.containsKey(val)) {
			return false;
		}

		// 获取待删除元素的索引
		int index = map.get(val);
		// 获取列表最后一个元素
		int lastElement = list.get(list.size() - 1);
		// 将最后一个元素移动到待删除元素的位置
		list.set(index, lastElement);
		// 更新最后一个元素的索引
		map.put(lastElement, index);
		// 删除最后一个元素
		list.remove(list.size() - 1);
		// 从哈希表中删除待删除元素
		map.remove(val);
		return true;
	}

	public int getRandom() {
		return list.get(random.nextInt(list.size()));
	}
}
