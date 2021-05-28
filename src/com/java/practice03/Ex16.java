package com.java.practice03;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner sc = new Scanner(System.in);
	System.out.print("숫자를 입력하세요 : ");
	int a = sc.nextInt();
	int sum = 0;
	int count = 0;
	
	for(int b=1; b<=a; b++) {
		if(b%5==0) {
			sum = sum +b;
			count++;
		}
		
	}
		
	System.out.println(sum);
	System.out.println(count);
	
	
	
	
	sc.close();
	
	
	
	
	
	
	}

}
