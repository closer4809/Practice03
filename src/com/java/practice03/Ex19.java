package com.java.practice03;

import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner sc = new Scanner(System.in);
	System.out.println("------------------------------");
	System.out.println("1.���� | 2.��� | 3.�ܰ� | 4.���� ");
	System.out.println("------------------------------");
	System.out.print("����>");
	int sum = 0;
	int a = sc.nextInt();
	
	
	switch(a) {
		case 4:
			System.out.println("���α׷� ����");
			break;
		
		case 1: 
			while(true) {
				int b = sc.nextInt();
				if(b==4) {
					
				System.out.println("���α׷� ����");
				break;
				}
					
				
				
				sum = sum + b;
				System.out.println("���ݾ�>"+sum);
				
				
			}
			
		case 2: 
			while(true) {
				int b = sc.nextInt();
				if(b==4) {
					
				System.out.println("���α׷� ����");
				break;
				}
					
				
				
				sum = sum - b;
				System.out.println("��ݾ�>"+sum);
				
				
			}
			
		case 3: 
			while(true) {
				int b = sc.nextInt();
				if(b==4) {
					
				System.out.println("���α׷� ����");
				break;
				}
					
				
				
				
				System.out.println("�ܰ��>"+sum);
				break;
				
				
			}
			
	
	
	
	
	
	}
	
	
	
	
	sc.close();
	
	
	
	
	
	}

}
