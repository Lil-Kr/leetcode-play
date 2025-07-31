package com.cy.leetcodeplay.backtracking.no93;

import com.alibaba.fastjson2.JSONArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.List;

class SolutionTest {
	private Solution solution = new Solution();

	@Test
	public void test1() {
		String s = "25525511135";
		List<String> res = solution.restoreIpAddresses(s);
		Assertions.assertEquals("[\"255.255.11.135\",\"255.255.111.35\"]", JSONArray.toJSONString(res));
	}

	@Test
	public void test2() {
		String s = "0000";
		List<String> res = solution.restoreIpAddresses(s);
		Assertions.assertEquals("[\"0.0.0.0\"]", JSONArray.toJSONString(res));
	}

	@Test
	public void test3() {
		String s = "101023";
		List<String> res = solution.restoreIpAddresses(s);
		Assertions.assertEquals("[\"1.0.10.23\",\"1.0.102.3\",\"10.1.0.23\",\"10.10.2.3\",\"101.0.2.3\"]", JSONArray.toJSONString(res));
	}
}