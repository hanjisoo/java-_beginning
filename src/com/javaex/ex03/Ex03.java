package com.javaex.ex03;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[]args) {
		
		Scanner sc=new Scanner(System.in);
		
		
		
		while(true) {            //for문은 범위적어줘야되는깐 안됨. true적어주는거!!
			
			System.out.println("숫자를 입력하세요");
			int num=sc.nextInt();
			
			if(num==0) {
			   System.out.println("종료.");
			   break;      //0일때 탈출. break를 만나면 가장가까운 반복문(while)을 나감.
		    }
			if(num%3==0) {
			     System.out.println("3의 배수입니다.");
			     
		    }else {
			     System.out.println("3의 배수가 아닙니다.");
		    }
		}
		sc.close();
	}
}
