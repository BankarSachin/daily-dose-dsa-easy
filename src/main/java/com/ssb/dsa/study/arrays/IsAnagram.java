package com.ssb.dsa.study.arrays;

/**
 * @author Sachin 
 * o(n)
 * s: o(1)
 * https://neetcode.io/problems/is-anagram
 */
public class IsAnagram {

	public boolean isAnagram(String source, String target) {

		if (source.length() != target.length()) {
			return false;
		}

		char[] charsSource = new char[26];
		char[] charsTarget = new char[26];
		for (int i = 0; i < source.length(); i++) {
			char s = source.charAt(i);
			char t = target.charAt(i);
			charsSource['z' - s]++;
			charsTarget['z' - t]++;
		}

		final String src = new String(charsSource);
		final String trg = new String(charsTarget);

		return src.equals(trg);
	}
}
