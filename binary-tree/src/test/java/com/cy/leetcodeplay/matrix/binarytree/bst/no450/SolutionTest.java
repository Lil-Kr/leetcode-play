package com.cy.leetcodeplay.matrix.binarytree.bst.no450;

import com.alibaba.fastjson2.JSONArray;
import com.cy.leetcodeplay.matrix.common.helper.Helper;
import com.cy.leetcodeplay.matrix.common.interfases.impl.BST;
import com.cy.leetcodeplay.matrix.common.entity.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void test1() {
		int key = 3;
		Integer[] nums1 = {5,3,6,2,4,7};
		BST bst = new BST(nums1);
		TreeNode root = bst.getRoot();
		TreeNode res1 = solution.deleteNode(root, key);
		String jsonString = JSONArray.toJSONString(Helper.getInOrderArray(res1));
		System.out.println(jsonString);
		Assertions.assertEquals("[2,4,5,6,7]",jsonString);
	}

	@Test
	public void test2() {
		int key = 0;
		Integer[] nums1 = {5,3,6,2,4,7};
		BST bst = new BST(nums1);
		TreeNode root = bst.getRoot();
		TreeNode res1 = solution.deleteNode(root, key);
		String jsonString = JSONArray.toJSONString(Helper.getInOrderArray(res1));
		System.out.println(jsonString);
		Assertions.assertEquals("[2,3,4,5,6,7]",jsonString);

	}
}