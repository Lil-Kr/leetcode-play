package com.cy.leetcodeplay.queue.no295;

import java.util.PriorityQueue;

/**
 * @Author: Lil-K
 * @Date: 2024/9/26
 * @Description: no.295. Find Median from Data Stream
 */
public class MedianFinder {


	// 大顶堆（存储较小的一半元素）
	private PriorityQueue<Integer> maxHeap;
	// 小顶堆（存储较大的一半元素）
	private PriorityQueue<Integer> minHeap;

	public MedianFinder() {
		maxHeap = new PriorityQueue<>((a, b) -> b - a);  // 大顶堆
		minHeap = new PriorityQueue<>();  // 小顶堆
	}

	public void addNum(int num) {
		// 先将新元素放入大顶堆
		maxHeap.offer(num);

		// 保证大顶堆的堆顶 不 大于小顶堆的堆顶
		minHeap.offer(maxHeap.poll());

		// 平衡两个堆的大小: 如果小顶堆的元素多于大顶堆, 则将小顶堆的堆顶移到大顶堆
		if (minHeap.size() > maxHeap.size()) {
			maxHeap.offer(minHeap.poll());
		}
	}

	public double findMedian() {
		// 如果总元素数是奇数, 则大顶堆的堆顶是中位数
		if (maxHeap.size() > minHeap.size()) {
			return maxHeap.peek();
		}
		// 如果总元素数是偶数, 则中位数是两个堆顶的平均值
		return (maxHeap.peek() + minHeap.peek()) / 2.0;
	}
}