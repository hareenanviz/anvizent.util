package com.anvizent.elt.anvizent.util;

import java.lang.reflect.Array;
import java.lang.reflect.Method;

public class VarArgsTest {
	public static String generate(String... args) {
		return "generate(String...)";
	}

	public static String generate(Integer i, String... args) {
		return "generate(int, String...)";
	}

	public static String generate(Integer i, String j, String... args) {
		return "generate(int, String, String...)";
	}

	public static String generate(Number... i) {
		return "generate(Number...)";
	}

	public static String generate(Integer i, Number... j) {
		return "generate(Integer, Number...)";
	}

	public static String generate(Integer i, String s, Number... j) {
		return "generate(Integer, s, Number[])";
	}

	public static String generate(Integer i, Number j) {
		return "generate(Integer, Number)";
	}

	public static void main(String[] args) {
		generate(1, "1", 2, 3, 5);

		for (Method method : VarArgsTest.class.getMethods()) {
			System.out.println("\n\n" + method);

			for (Class<?> type : method.getParameterTypes()) {
				System.out.print(type + "(" + type.equals(Array.newInstance(Number.class, 0).getClass()) + "),\t");
			}
		}

		System.out.println(Array.newInstance(Number.class, 0).getClass().getComponentType());

		System.out.println(Number[].class.isAssignableFrom(Integer[].class));
	}
}
