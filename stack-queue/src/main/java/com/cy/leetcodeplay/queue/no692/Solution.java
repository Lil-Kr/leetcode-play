package com.cy.leetcodeplay.queue.no692;

import java.util.*;

/**
 * @Author: Lil-K
 * @Date: 2024/9/25
 * @Description: no.692. Top K Frequent Words
 */
public class Solution {


	/**
	 *
	 * @param words
	 * @param k
	 * @return
	 */
	public List<String> topKFrequent(String[] words, int k) {
		if (k < 1) return new ArrayList<>();

		Map<String, Integer> freq = new HashMap<>();
		for (String word : words) {
			freq.put(word, freq.getOrDefault(word, 0) + 1);
		}

		PriorityQueue<Map.Entry<String, Integer>> minHeap = new PriorityQueue<>(
			(a, b) -> a.getValue().equals(b.getValue())
				? a.getKey().compareTo(b.getKey()) // 如果频率相同, 按字典序升序
				: b.getValue() - a.getValue()      // 否则按频率降序
		);

		/**
		 * 将所有频率放入堆中, 堆会自动排序
		 */
		for (Map.Entry<String, Integer> entry : freq.entrySet()) {
			minHeap.offer(entry);
		}

		List<String> res = new ArrayList<>();
		while (k > 0 && !minHeap.isEmpty()) {
			res.add(minHeap.poll().getKey());
			k--;
		}

		return res;
	}

	/**
	 *
	 * @param words
	 * @param k
	 * @return
	 */
	public List<String> topKFrequent2(String[] words, int k) {
		// Step 1: 统计每个单词的频率
		Map<String, Integer> freqMap = new HashMap<>();
		for (String word : words) {
			freqMap.put(word, freqMap.getOrDefault(word, 0) + 1);
		}

		// Step 2: 使用小顶堆排序
		PriorityQueue<Map.Entry<String, Integer>> minHeap = new PriorityQueue<>(
			(a, b) -> a.getValue().equals(b.getValue())
				? b.getKey().compareTo(a.getKey())  // 按字典序降序
				: a.getValue() - b.getValue()       // 按频率升序
		);

		// Step 3: 将每个频率放入堆中
		for (Map.Entry<String, Integer> entry : freqMap.entrySet()) {
			minHeap.offer(entry);
			if (minHeap.size() > k) {
				minHeap.poll();  // 保持堆的大小为k
			}
		}

		// Step 4: 从堆中提取频率最高的 k 个单词
		List<String> res = new ArrayList<>();
		while (!minHeap.isEmpty()) {
			res.add(minHeap.poll().getKey());
		}

		// Step 5: 由于是从小顶堆中提取, 顺序是反的, 故需要反转
		Collections.reverse(res);
		return res;
	}
}