package com.cy.leetcodeplay.matrix.linkedlist.no146;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

class LRUCacheTest {

	private LRUCache lruCache;

	@BeforeEach
	public void init() {
		lruCache = new LRUCache(2);
	}

	@Test
	public void test1() {
		/**
		 * ["LRUCache", "put", "put", "get", "put", "get", "put", "get", "get", "get"]
		 * [[2], [1, 1], [2, 2], [1], [3, 3], [2], [4, 4], [1], [3], [4]]
		 */
		lruCache.put(1, 1);
		lruCache.put(2, 2);
		int res1 = lruCache.get(1);
		Assertions.assertEquals(1, res1);
		lruCache.put(3, 3);
		lruCache.put(3, 100);
		int res2 = lruCache.get(2);
		Assertions.assertEquals(-1, res2);
		lruCache.put(4, 4);
		int res3 = lruCache.get(1);// return -1 (not found)
		Assertions.assertEquals(-1, res3);
		int res4 = lruCache.get(3);// return 3
		Assertions.assertEquals(100, res4);
		int res5 = lruCache.get(4);    // return 4
		Assertions.assertEquals(4, res5);
	}

	/**
	 *
	 */
	@Test
	public void a() {
		Map<Integer, Integer> map = new HashMap<>();

		map.put(1, 1);
		map.put(2, 2);

		Integer val = map.get(2);
		val = 4;
		Integer a = map.get(2);
		System.out.println(a);
	}
}