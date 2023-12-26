package com.javaex.ex02;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {

		// 조건문 연습문제4
		Scanner sc = new Scanner(System.in);

		System.out.print("점수를 입력하세요 : ");
		int score = sc.nextInt();

		if (score >= 90) {
			System.out.println("A등급");
		} else if (score >= 80 && score < 90) {
			System.out.println("B등급");
		} else if (score >= 70 && score < 80) {
			System.out.println("C등급");
		} else if (score >= 60 && score < 70) {
			System.out.println("D등급");
		} else if (score < 60) {
			System.out.println("F등급");
		}

	}

}
