package com.java.practice03;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
			
		System.out.print("숫자를 입력하세요 : ");
		
		int a = sc.nextInt();
			
		
		int c = 0;
		
		for(int b=0; b<=a; b++) {
			c = c + b;
		}
		
		System.out.print("합계 : ");
		System.out.println(c);
		
		
		
		sc.close();
		
	}

}
