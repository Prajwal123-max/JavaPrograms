/*
	Enter the size:5
	A 
	B C 
	D E F 
	G H I J 
	K L M N O 
 */

package com.patterns;

import java.util.Scanner;

public class Patternss29 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the size:");
		int n=s.nextInt();
		
		char ch='A';
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(ch+" ");
				ch++;
			}
			System.out.println();
		}
	}

}
