package com.javaex.ex03;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.[0이면 종료]");
		int num = sc.nextInt();

		do {
			int sum = +num;
			System.out.println("합계 : " + sum);
			num = sum + sc.nextInt();

		} while (num != 0);
		sc.close();
	}

}
