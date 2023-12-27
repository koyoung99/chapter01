package com.javaex.ex03;

public class Ex07 {

	public static void main(String[] args) {

		//반복문 conntinue
		
		for (int i = 1; i <= 20; i++) {
			if (i % 2 != 0 && i % 3 != 0) {
				System.out.println(i);
				continue;
			}

		}

	}

}
