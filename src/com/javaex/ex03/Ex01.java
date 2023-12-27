package com.javaex.ex03;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {

		//for 반복문 문제
		
		// while문
		/*
		Scanner sc = new Scanner(System.in);
		
		int dan;
		int i=1;
		
		System.out.println("단을 입력하세요");
		System.out.print("단 : ");
		dan = sc.nextInt();
		while (i < 10) {
			System.out.println(dan+"*"+i+"="+dan*i);

			i++;
		}
		sc.close();
		*/
		
		// for문
		Scanner sc=new Scanner(System.in);
		
		int dan; 
		int i=1;
		System.out.println("단을 입력하세요");
		System.out.print("단 : ");
		
		dan=sc.nextInt();
		
		for(i=1;i<10;i++) {
			System.out.println(dan+"*"+i+"="+dan*i);
		}
		
		
	}

}
