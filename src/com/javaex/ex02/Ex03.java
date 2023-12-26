package com.javaex.ex02;

import java.util.Scanner;

public class Ex03 {
	public static void main(String args[]) {

		// 조건문 연습문제2
		Scanner sc = new Scanner(System.in);

		System.out.print("근무시간 : ");
		int worktime = sc.nextInt();
		int price;

		if (worktime <= 8) {
			price = worktime * 10000;
			System.out.println("임금은 " + price + " 입니다.");
		} else if (worktime > 8) {
			price = 80000 + (int) ((worktime - 8) * 10000 * 1.5);
			System.out.println("임금은 " + price + "원 입니다.");

		}
	}
}
