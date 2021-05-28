package com.java.practice03;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner sc = new Scanner(System.in);
	
	System.out.println("숫자를 입력하세요");
	int a = sc.nextInt();
	
	for(int y=1; y<=a; y++) {
		for(int x=1; x<=y; x++) {
			System.out.print(y);
		
		}
		System.out.println("");
	}
	
	
	
	
	sc.close();
	
	
	
	}

}
