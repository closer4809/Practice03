package com.java.practice03;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


	Scanner sc = new Scanner(System.in);
	System.out.print("숫자를 입력하세요 : ");		
	int a = sc.nextInt();
	
	for(int b=1; b<=a; b++) {
		if(a%b == 0) {
			System.out.println(b);
		}
	}
	
	

	
			
			
			
	sc.close();
	
	
	
	
	
	}

}
