package com.cy.leetcodeplay.matrix.linkedlist.no148;

import com.cy.leetcodeplay.matrix.common.entity.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void test1() {
		int[] nums = {4, 2, 1, 3, 5};
		ListNode nodes = new ListNode(nums);
		ListNode res1 = solution.sortList(nodes);
		System.out.println(res1.toString());
		Assertions.assertEquals("1 -> 2 -> 3 -> 4 -> 5 -> null", res1.toString());
	}

	@Test
	public void test2() {
		int[] nums = {4, 2, 1};
		ListNode nodes = new ListNode(nums);
		ListNode res1 = solution.sortList(nodes);
		System.out.println(res1.toString());
		Assertions.assertEquals("1 -> 2 -> 4 -> null", res1.toString());
	}
}