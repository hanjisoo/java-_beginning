package com.javaex.ex02;

import java.util.Scanner;

public class Ex04 {
  public static void main(String[]args) {
	 /* Scanner sc=new Scanner(System.in);
	  System.out.println("월을 입력하세요");
	  int month=sc.nextInt();
	  
	  switch(month) {
	  case 1:
		  System.out.println("31일");
       break;	    // 괄호밖으로 나가버려
	  case 2:
		  System.out.println("28일");
       break;	
	  case 3:
		  System.out.println("31일");
       break;	
	  case 4:
		  System.out.println("30일");
       break;	
	  case 5:
		  System.out.println("31일");
       break;	
	  case 6:
		  System.out.println("30일");
       break;	
	  case 7:
		  System.out.println("31일");
       break;
	  case 8:
		  System.out.println("31일");
       break;	
	  case 9:
		  System.out.println("30일");
       break;	
	  case 10:
		  System.out.println("31일");
       break;
	  case 11:
		  System.out.println("30일");
       break;
	  case 12:
		  System.out.println("31일");
       break;	
	  } */
	  
	  
	  
	  Scanner sc=new Scanner(System.in);
	  System.out.println("점수를 입력하세요: ");
	  int score =sc.nextInt();
	  
	  
	  if(score>=90) {
		  System.out.println("A등급");
	  }else if(score>=80) {
		  System.out.println("B등급");
	  }else if(score>=70) {
		  System.out.println("C등급");
	  }else if(score>=60) {
		  System.out.println("D등급");
	  }else
		  System.out.println("F등급");
 
  }
}
