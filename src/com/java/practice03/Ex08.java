package com.java.practice03;

public class Ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int a=1; a<=9; a++) {
			for(int b=2; b<=9; b++) {
				int c = a*b;
				System.out.print(b+"*"+a+"="+c);
				if(c>=10) {System.out.print("  ");}
				else if(c<10) {System.out.print("   ");}
			}
		System.out.println("");
		}
	
	
	
	}
	
	
	
}

