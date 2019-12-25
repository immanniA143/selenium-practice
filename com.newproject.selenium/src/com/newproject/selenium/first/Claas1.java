package com.newproject.selenium.first;

import java.util.Scanner;

public class Claas1 {
	public static void main(String[] args) {
		String s1;
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string value");
		s1=sc.nextLine();
		System.out.println(s1);
		System.out.println("enter a valid integer numarator");
		a=sc.nextInt();
		System.out.println("enter a valid integer denominator");
		b=sc.nextInt();
		c=a/b;
		System.out.println(c);
		if(a%2==0)
			System.out.println("the number is an even number");
		else
			System.out.println("the given number is an odd number");
	}

}
