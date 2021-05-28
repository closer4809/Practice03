package com.java.practice03;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int a = sc.nextInt();
		
		int c = 1;
		
		for(int b=1; b <=a; b++) {
			
			c = c*(1*b);
		}
		System.out.print("결과값 : "+c);
		
		
		
		
		
		
		sc.close();
	
	
	
	}

}
