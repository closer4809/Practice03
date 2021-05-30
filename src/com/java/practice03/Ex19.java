package com.java.practice03;

import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner sc = new Scanner(System.in);
	System.out.println("------------------------------");
	System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료 ");
	System.out.println("------------------------------");
	System.out.print("선택>");
	int sum = 0;
	int a = sc.nextInt();
	
	
	switch(a) {
		case 4:
			System.out.println("프로그램 종료");
			break;
		
		case 1: 
			while(true) {
				int b = sc.nextInt();
				if(b==4) {
					
				System.out.println("프로그램 종료");
				break;
				}
					
				
				
				sum = sum + b;
				System.out.println("예금액>"+sum);
				
				
			}
			
		case 2: 
			while(true) {
				int b = sc.nextInt();
				if(b==4) {
					
				System.out.println("프로그램 종료");
				break;
				}
					
				
				
				sum = sum - b;
				System.out.println("출금액>"+sum);
				
				
			}
			
		case 3: 
			while(true) {
				int b = sc.nextInt();
				if(b==4) {
					
				System.out.println("프로그램 종료");
				break;
				}
					
				
				
				
				System.out.println("잔고액>"+sum);
				break;
				
				
			}
			
	
	
	
	
	
	}
	
	
	
	
	sc.close();
	
	
	
	
	
	}

}
