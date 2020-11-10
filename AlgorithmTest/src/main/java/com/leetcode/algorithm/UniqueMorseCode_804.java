package com.leetcode.algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * 唯一摩尔斯密码词
 * [一句话功能简述]
 * @Title: UniqueMorseCode_804.java
 * @Package com.leetcode.algorithm
 * @Description: JUST CODING
 * @author Faep
 * @date 2018年8月2日
 * @version V1.0
 */
 /**
  *[题目描述]给定一个单词列表，每个单词可以写成每个字母对应摩尔斯密码的组合。
  *例如，"cab" 可以写成 "-.-.-....-"，(即 "-.-." + "-..." + ".-"字符串的结合)。
  *我们将这样一个连接过程称作单词翻译。
  *返回我们可以获得所有词不同单词翻译的数量。
 */
public class UniqueMorseCode_804 {
	
	public int uniqueMorseRepresentations(String[] words) {
		List<String> list = new ArrayList<>();
		for (int i = 0; i < words.length; i++) {
			String mc = morseCode(words[i]);
			if(!list.contains(mc))
				list.add(mc);
		}
		return list.size();
    }
	
	public String morseCode(String word) {

		String[] code = new String[] { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-",
				".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--",
				"--.." };
		//小写的a对应的ASCII码值是97
		StringBuilder  sb = new StringBuilder();
		for(int i = 0;i<word.length();i++){
			//获取当前字母的ASCII码值
			int co = word.charAt(i);
			sb.append(code[co-97]);
		}
		
		return sb.toString();
	}

	public static void main(String[] args) {
		String[]  words = new String[]{"gin", "zen", "gig", "msg"};
		int count = new UniqueMorseCode_804().uniqueMorseRepresentations(words);
		System.out.println(count);
	}

}
