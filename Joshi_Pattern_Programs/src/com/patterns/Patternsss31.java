/*
	Enter the size:5
	A 
	B B 
	C C C 
	D D D D 
	E E E E E
 */

package com.patterns;

import java.util.Scanner;

public class Patternsss31 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the size:");
		int n=s.nextInt();
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print((char)(i+64)+" ");
			}
			System.out.println();
		}
	}

}