package com.cy.leetcodeplay.array.no438;

import com.alibaba.fastjson2.JSONArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

  private Solution solution = new Solution();

  @Test
  public void test1() {
    String s = "cbaebabacd";
    String p = "abc";

    List<Integer> anagrams = Solution.findAnagrams(s, p);
    Assertions.assertEquals("[0,6]", JSONArray.toJSONString(anagrams));
  }

  @Test
  public void test2() {
    String s = "abab";
    String p = "ab";

    List<Integer> anagrams = Solution.findAnagrams(s, p);
    Assertions.assertEquals("[0,1,2]", JSONArray.toJSONString(anagrams));
  }

  @Test
  public void test3() {
    String s = "babab";
    String p = "abb";

    List<Integer> anagrams = Solution.findAnagrams(s, p);
    Assertions.assertEquals("[0,2]", JSONArray.toJSONString(anagrams));
  }

  @Test
  public void test4() {
    String s = "aa";
    String p = "bb";

    List<Integer> anagrams = Solution.findAnagrams(s, p);
    Assertions.assertEquals("[]", JSONArray.toJSONString(anagrams));
  }
}