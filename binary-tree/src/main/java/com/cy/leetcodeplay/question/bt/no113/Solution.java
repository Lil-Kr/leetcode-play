package com.cy.leetcodeplay.question.bt.no113;

import com.cy.common.util.printtree.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Lil-K
 * @Date: 2024/10/3
 * @Description: no.113. Path Sum II
 *
 * 这是一个典型的树的 回溯 问题. 你需要从根节点开始向下递归遍历每一条路径, 计算当前路径上的节点值之和, 直到到达叶子节点.
 * 如果路径和等于目标值 targetSum, 则将该路径添加到结果列表中.
 * 使用 深度优先搜索（DFS） 来遍历树, 并且使用回溯法来保存并恢复当前路径.
 */
public class Solution {

	/**
	 *
	 * @param root
	 * @param targetSum
	 * @return
	 */
	public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
		if (root == null) return new ArrayList<>();

		List<List<Integer>> res = new ArrayList<>();
		List<Integer> currentPath = new ArrayList<>();
		dfs(root, targetSum, currentPath, res);
		return res;
	}

	public void dfs(TreeNode node, int targetSum, List<Integer> currentPath, List<List<Integer>> res) {
		if (node == null) return;
		/**
		 * 加入list
		 */
		currentPath.add(node.val);

		if (node.left == null && node.right == null && node.val == targetSum) {
			res.add(new ArrayList<>(currentPath));
		} else {
			/**
			 * 减去自身
			 */
			dfs(node.left, targetSum - node.val, currentPath, res);
			dfs(node.right, targetSum - node.val, currentPath, res);
		}

		currentPath.remove(currentPath.size() - 1);
	}
}