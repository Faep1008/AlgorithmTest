package com.leetcode.algorithm;

import java.util.LinkedList;
import java.util.List;
/**
 * [一句话功能简述]
 * @Title: FizzBuzz.java
 * @Package com.leetcode.algorithm
 * @Description: JUST CODING
 * @author Faep
 * @date 2018年7月27日
 * @version V1.0
 */
 /**
  *[题目描述]写一个程序，输出从 1 到 n 数字的字符串表示。
  *1. 如果 n 是3的倍数，输出“Fizz”；
  *2. 如果 n 是5的倍数，输出“Buzz”；
  *3.如果 n 同时是3和5的倍数，输出 “FizzBuzz”。
 */
public class FizzBuzz_412 {

	public List<String> fizzBuzz(int n) {

		List<String> list = new LinkedList<>();

		for (int i = 1; i <= n; i++) {
			if (i % 3 == 0 && i % 5 == 0)
				list.add("FizzBuzz");
			else if (i % 3 == 0)
				list.add("Fizz");
			else if (i % 5 == 0)
				list.add("Buzz");
			else
				list.add(i + "");
		}
		return list;
	}
	
	public static void main(String[] args) {
		System.out.println(new FizzBuzz_412().fizzBuzz(15));
	}
}
