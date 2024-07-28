/*
	Enter the size:5
	1 2 3 4 5 
	2     5 
	3   5 
	4 5 
	5 
 */

package com.patterns;

import java.util.Scanner;

public class Patternsss33 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the size:");
		int n=s.nextInt();
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n-i+1; j++) {
				if(i==1||j==1) {
					System.out.print(i*j+" ");
				}
				else if(j==n-i+1) {
					System.out.print(n+" ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}
