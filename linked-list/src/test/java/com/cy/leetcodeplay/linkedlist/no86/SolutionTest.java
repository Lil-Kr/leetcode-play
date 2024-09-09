package com.cy.leetcodeplay.linkedlist.no86;

import com.cy.leetcodeplay.classes.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void test1() {
		int[] nums = {1,4,3,2,5,2};
		ListNode head = new ListNode(nums);
		solution.partition(head, 3);
		String res1 = head.toString();
		System.out.println(res1);
		Assertions.assertEquals("1 -> 2 -> 2 -> 4 -> 3 -> 5 -> null", res1);
	}

	@Test
	public void test2() {
		int[] nums = {2,1};
		ListNode head = new ListNode(nums);
		ListNode res1 = solution.partition(head, 2);
		System.out.println(res1);
		Assertions.assertEquals("1 -> 2 -> null", res1.toString());
	}
}