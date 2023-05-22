package com.anvizent.elt.anvizent.util;

public class StringUtil {

	public static String trim(String s) {
		return s == null ? null : s.trim();
	}

	public static String upperCase(String s) {
		return s == null ? null : s.toUpperCase();
	}

	public static String lowerCase(String s) {
		return s == null ? null : s.toLowerCase();
	}

	public static String subString(String s, Integer beginIndex) {
		return s == null || beginIndex == null || beginIndex < 0 ? null : s.substring(beginIndex);
	}

	public static String subString(String s, Integer beginIndex, Integer endIndex) {
		if (s == null || beginIndex == null || beginIndex < 0 || endIndex == null || endIndex <= beginIndex) {
			return null;
		}

		if (endIndex >= s.length()) {
			endIndex = s.length();
		}

		return s.substring(beginIndex, endIndex);
	}

	public static Integer length(String s) {
		return s == null ? null : s.length();
	}

	public static String replace(String s, String find, String replaceWith) {
		return s == null ? null : (find == null || replaceWith == null ? s : s.replace(find, replaceWith));
	}
}
