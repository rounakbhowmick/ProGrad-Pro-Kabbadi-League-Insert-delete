package com.kabbadi;

import java.util.Scanner;

public final class KeyboardUtil {
	public static String getString(String message) {
		System.out.println(message);
		Scanner sc = new Scanner(System.in);
		return sc.nextLine();
	}
}
