//Code For Equality
package com.test;

import java.util.*;

public class ArrayEqality {
	public static void main(String[] args) {
		int a[] = { 12, 13, 14 };
		int b[] = { 12, 13, 14 };

		boolean result = Arrays.equals(a, b);

		if (result == true) {
			System.out.println("Two arrays are equal");
		} else {

			System.out.println("Two arrays are not equal");
		}
	}
}