package com.javaex.ex01;

public class Ex05 {
	public static void main (String[] args){
		
	  int a=5;
	  int b=3;
	  
	  boolean result=a<b;
	  System.out.println(result);
	  
	  System.out.println(a>b);
	  
	  System.out.println(a==b);
	  System.out.println(a!=b);
	  
	  System.err.println(a>b && a<b); //T&&F
	  System.err.println(a>b || a<b); //T||F

	}
}
