package com.cy.leetcodeplay.findtable.no383;

import com.cy.leetcodeplay.findtable.no383.Solution;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
	private Solution solution = new Solution();

	@Test
	public void test1() {
		String ransomNote = "aa", magazine = "aab";
		boolean res1 = solution.canConstruct(ransomNote, magazine);
		Assertions.assertEquals(true, res1);
	}
}