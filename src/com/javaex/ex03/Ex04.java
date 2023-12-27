package com.javaex.ex03;

public class Ex04 {

	public static void main(String args[]) {

		// for반복문 연습문제(중첩반복문)

		/*
		 * for (int i = 1; i <= 5; i++) {
		 * 
		 * System.out.println("*****");
		 * 
		 * }
		 */

		for (int i = 1; i < 6; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
