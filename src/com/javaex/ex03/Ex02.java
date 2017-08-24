package com.javaex.ex03; //반복문 while, for

import java.util.Scanner;

public class Ex02 {
	public static void main(String[]args) {
			
		Scanner sc=new Scanner(System.in);
		System.out.println("단을 입력해주세요");
		int dan=sc.nextInt();
		/*int i=1;
		
		while(i<10) {
			
			System.out.println(dan+"*"+i+"="+dan*i);
		
		    i++;	
		}*/
		
		
		for(int i=1; i<10; i++) {
			System.out.println(dan+"*"+i+"="+dan*i);
		}
        sc.close();
	}
}
