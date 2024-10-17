package com.cy.leetcodeplay.question.bt.no129;

import com.cy.common.entity.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Lil-K
 * @Date: 2024/10/5
 * @Description: no.129. Sum Root to Leaf Numbers
 */
public class Solution {

	/**
	 *
	 * @param root
	 * @return
	 */
	public int sumNumbers(TreeNode root) {
		if(root == null) return 0;

		List<Integer> res = new ArrayList<>();
//		builder1(root, String.valueOf(root.val), res);
//		return res.size() > 0 ? res.stream().mapToInt(Integer::intValue).sum() : 0;
		return builder(root, 0);
	}

	/**
	 *
	 * @param node
	 * @param sum 12 13
	 * @return
	 */
	private int builder(TreeNode node, int sum) {
		if (node == null) return 0;

		/**
		 * 处理当前数字
		 */
		sum = sum * 10 + node.val;
		if (node.left == null && node.right == null) {
			return sum;
		}

		return builder(node.left, sum) + builder(node.right, sum);
	}

	/**
	 * 写法二: 性能差一些
	 * @param node
	 * @param num
	 * @param res
	 */
	private void builder1(TreeNode node, String num, List<Integer> res) {
		if (node.left == null && node.right == null) {
			res.add(Integer.parseInt(num));
			return;
		}

		if (node.left != null) {
			builder1(node.left, num + String.valueOf(node.left.val), res);
		}

		if (node.right != null) {
			builder1(node.right, num + String.valueOf(node.right.val), res);
		}
	}

}