package com.will.algorithm.leetcode;

/**
 * created by jiayi.chen on 2018/5/16
 */
public class ReverseInteger {

  /**
   * 123---321
   */
  public static int reverse(int x) {
    if (x == 0) {
      return 0;
    }
    long s = 0;
    for (int p = x / 10, q = x % 10; p != 0 || q != 0; ) {
      s = (s * 10) + q;
      q = p % 10;
      p = p / 10;
    }
    if(s>Integer.MAX_VALUE||s<Integer.MIN_VALUE){
      return 0;
    }
    return (int) s;
  }

  public static void main(String[] args) {
    System.out.println(reverse(123));
    System.out.println(reverse(-123));
  }

}
