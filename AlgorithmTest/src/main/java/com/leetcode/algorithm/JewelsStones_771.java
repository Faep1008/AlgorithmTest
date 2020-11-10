package com.leetcode.algorithm;

import java.util.Arrays;
import java.util.List;
/**
 * 宝石与石头
 * 
 * @Title: JewelsStones.java
 * @Package com.leetcode.algorithm
 * @Description: JUST CODING
 * @author Faep
 * @date 2018年8月1日
 * @version V1.0
 */
 /**
  *[题目描述]给定字符串J 代表石头中宝石的类型，和字符串 S代表你拥有的石头。
  * S 中每个字符代表了一种你拥有的石头的类型，你想知道你拥有的石头中有多少是宝石。
  * J 中的字母不重复，J 和 S中的所有字符都是字母。字母区分大小写，因此"a"和"A"是不同类型的石头。
 */
public class JewelsStones_771 {
	
	public int numJewelsInStones(String J, String S) {
        int index = 0;
        List<String> list = Arrays.asList(J.split(""));
        for(int i=0;i<S.length();i++){
            char c = S.charAt(i);
            if(list.contains(c+""))
                index++;
        }
        return index;
    }

	public static void main(String[] args) {
		String J = "z";
		String S = "ZZZ";
		int index = new JewelsStones_771().numJewelsInStones(J, S);
		System.out.println(index);
	}

}
