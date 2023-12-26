package com.javaex.ex02;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {

		// 조건문 연습문제1
		Scanner sc = new Scanner(System.in);

		System.out.print("근무시간 : ");
		int worktime = sc.nextInt();
		int price;
		if (worktime <= 8) {
			price = worktime * 10000;
			System.out.println("임금은 " + price + "원 입니다.");
		} else if (worktime > 8) {
			price = (((worktime - (worktime - 8)) * 10000) + (worktime - 8) * 12000);
			System.out.println("임금은 " + +price + "원 입니다.");
		}

	}

}
