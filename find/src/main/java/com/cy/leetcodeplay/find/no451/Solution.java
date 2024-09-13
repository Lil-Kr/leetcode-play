package com.cy.leetcodeplay.find.no451;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * @Author: Lil-K
 * @Date: 2024/9/5
 * @Description: no.451. Sort Characters By Frequency
 */
public class Solution {

	/**
	 *
	 * @param s
	 * @return
	 */
	public String frequencySort(String s) {
		if (s.length() <= 1) return s;

		Map<String, Integer> freqMap = new HashMap<>();

		for (int i = 0; i < s.length(); i++) {
			String str = Character.toString(s.charAt(i));
			freqMap.put(str, freqMap.getOrDefault(str, 0) + 1);
		}

		/**
		 * 使用大顶堆
		 * 备注: 这里还可以使用List<>, 然后排序
		 */
		PriorityQueue<Map.Entry<String, Integer>> maxHeap = new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());
		maxHeap.addAll(freqMap.entrySet());

		// 3. 构造结果
		StringBuilder result = new StringBuilder();
		while (!maxHeap.isEmpty()) {
			Map.Entry<String, Integer> entry = maxHeap.poll();
			String key = entry.getKey();
			Integer freq = entry.getValue();
			for (int i = 0; i < freq; i++) {
				result.append(key);
			}
		}
		return result.toString();
	}
}
