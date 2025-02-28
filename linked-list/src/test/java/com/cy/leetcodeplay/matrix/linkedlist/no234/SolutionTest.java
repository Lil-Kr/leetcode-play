package com.cy.leetcodeplay.matrix.linkedlist.no234;

import com.cy.leetcodeplay.matrix.common.entity.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void test1() {
		int[] nums = {1, 2, 2, 1};
		ListNode nodes = new ListNode(nums);
		boolean res1 = solution.isPalindrome2(nodes);
		Assertions.assertEquals(true, res1);
	}

	@Test
	public void test2() {
		int[] nums = {1,2};
		ListNode nodes = new ListNode(nums);
		boolean res1 = solution.isPalindrome2(nodes);
		Assertions.assertEquals(false, res1);
	}

	@Test
	public void test3() {
		int[] nums = {1};
		ListNode nodes = new ListNode(nums);
		boolean res1 = solution.isPalindrome2(nodes);
		Assertions.assertEquals(true, res1);
	}

	@Test
	public void test4() {
		int[] nums = {1,1,2,1};
		ListNode nodes = new ListNode(nums);
		boolean res1 = solution.isPalindrome2(nodes);
		Assertions.assertEquals(false, res1);
	}

	@Test
	public void test5() {
		int[] nums = {1,2,1,2,3};
		ListNode nodes = new ListNode(nums);
		boolean res1 = solution.isPalindrome2(nodes);
		Assertions.assertEquals(false, res1);
	}

}