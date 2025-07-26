package com.cy.leetcodeplay.binarytree.tree.no690;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: Lil-K
 * @Date: 2025/7/26
 * @Description: no.690. Employee Importance
 * link: https://leetcode.com/problems/employee-importance/description/
 */
public class Solution {

	public int getImportance(List<Employee> employees, int id) {
		Map<Integer, Employee> map = new HashMap<>();
		for (Employee e : employees) {
			map.put(e.id, e);
		}
		return dfs(id, map);
	}

	/**
	 *
	 * @param id
	 * @param map
	 * @return
	 */
	private int dfs(int id, Map<Integer, Employee> map) {
		Employee e = map.get(id);
			int total = e.importance;
		for (int subId : e.subordinates) {
			total += dfs(subId, map);
		}
		return total;
	}
}