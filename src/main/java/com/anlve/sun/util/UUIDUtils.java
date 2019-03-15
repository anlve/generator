package com.anlve.sun.util;

import java.util.UUID;

/**
 * @description generate UUID
 * @author ANLVE
 * @version 1.0
 */
public class UUIDUtils {

	/**
	 * generateUUID 在亿次级数据测试结果比正则替换效率快一倍
	 * @return 32位UUID
	 */
	public static String generateUUID() {
		char[] src = UUID.randomUUID().toString().toCharArray();
		char[] chars = new char[32];
		for (int i = 0, j = 0; i < src.length; i++) {
			char c = src[i];
			if ('-' != c) {
				chars[j++] = c;
			}
		}
		return new String(chars);
	}

	public static void main(String[] args) {
		System.out.println(generateUUID());
		System.out.println(generateUUID().toString().length());
	}
}