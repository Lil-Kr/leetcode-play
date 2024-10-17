package com.cy.leetcodeplay.question.bt.no437;

import com.cy.common.entity.TreeNode;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: Lil-K
 * @Date: 2024/10/6
 * @Description: no.437. Path Sum III
 */
public class Solution {

	/**
	 * 解法一: 两个递归嵌套完成, 性能较差
	 * 时间复杂度：O(n^2)
	 * 空间复杂度: O(h)
	 * @param root
	 * @param targetSum
	 * @return
	 */
	public int pathSum2(TreeNode root, int targetSum) {
		if (root == null) {
			return 0;
		}
		/**
		 * 首先向下寻找以root为根的二叉树中, 查找是否包含和为 targetSum的路径,
		 */
		int res = findPath(root, targetSum);

		/**
		 * 去除root根节点, 以root.left 为根的二叉树中, 查找是否包含和为 targetSum 的路径
		 * 去除root根节点, 以root.right 为根的二叉树中, 查找是否包含和为 targetSum 的路径
		 */
		res += pathSum(root.left, targetSum);
		res += pathSum(root.right, targetSum);
		return res;
	}

	private int findPath(TreeNode node, long num) {
		if (node == null) {
			return 0;
		}

		int res = (node.val == num) ? 1 : 0;

		res += findPath(node.left, num - node.val);
		res += findPath(node.right, num - node.val);
		return res;
	}

	/** ===================================================================== **/

	/**
	 * 解法二: 前缀和 + hash table
	 * 二叉树前序遍历
	 * @param root
	 * @param targetSum
	 * @return
	 */
	public int pathSum(TreeNode root, int targetSum) {
		// 前缀和哈希表，记录到达每个节点时的前缀和的次数
		Map<Long, Integer> prefixSumMap = new HashMap<>();
		// 初始化，前缀和为 0 的路径有 1 条
		prefixSumMap.put(0L, 1);
		// 从根节点开始 DFS
		return dfs(root, 0, targetSum, prefixSumMap);
	}

	/**
	 *
	 * @param node
	 * @param currSum
	 * @param targetSum
	 * @param prefixSumMap
	 * @return
	 */
	private int dfs(TreeNode node, long currSum, int targetSum, Map<Long, Integer> prefixSumMap) {
		if (node == null) {
			return 0;
		}

		// 更新当前路径的前缀和
		currSum += node.val;

		// 查看是否存在从祖先节点到当前节点的路径和为 targetSum 的路径
		int res = prefixSumMap.getOrDefault(currSum - targetSum, 0);

		// 将当前前缀和加入哈希表
		prefixSumMap.put(currSum, prefixSumMap.getOrDefault(currSum, 0) + 1);

		// 递归处理左右子树
		res += dfs(node.left, currSum, targetSum, prefixSumMap);
		res += dfs(node.right, currSum, targetSum, prefixSumMap);

		// 回溯：移除当前节点的前缀和, 确保不影响其他路径的计算
		prefixSumMap.put(currSum, prefixSumMap.get(currSum) - 1);

		return res;
	}
}