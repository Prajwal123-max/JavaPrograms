/*
	Enter the size:5
	*
	***
	*****
	*******
	*********
 */

package com.patterns;

import java.util.Scanner;

public class Patternss20 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the size:");
		int n=s.nextInt();
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=2*i-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}