package com.will.algorithm.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * created by jiayi.chen on 2018/5/16
 */
public class TwoNum {

  /**
   * 用空间换时间，利用hashmap的快速查找
   * 思考：怎么转换成hashmap的查找问题
   * 同时：避免n不能是hashmap中当前的那一个数
   */
  public int[] twoSum(int[] nums, int target) {
    if (nums == null || nums.length == 0) {
      return new int[]{};
    }
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      map.put(nums[i], i);
    }
    for (int i = 0; i < nums.length; i++) {
      int n = target - nums[i];
      if (map.containsKey(n) && map.get(n) != i) {
        return new int[]{i, map.get(n)};
      }
    }
    return new int[]{};
  }

  public static void main(String[] args) {
    TwoNum twoNum = new TwoNum();
    int[] result = twoNum.twoSum(new int[]{3, 2, 4}, 6);
    Helper.printArray(result);
  }

}
