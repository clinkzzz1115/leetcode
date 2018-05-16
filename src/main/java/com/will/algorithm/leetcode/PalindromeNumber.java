package com.will.algorithm.leetcode;

/**
 * created by jiayi.chen on 2018/5/16
 */
public class PalindromeNumber {

  public static boolean isPalindrome(int x) {
    if (x < 0) {
      return false;
    }
    long s = 0;
    for (int p = x / 10, q = x % 10; p != 0 || q != 0; ) {
      s = s * 10 + q;
      q = p % 10;
      p = p / 10;
    }
    return s == x;
  }

  public static void main(String[] args) {
    System.out.println(isPalindrome(121));
    System.out.println(isPalindrome(-121));
  }

}
