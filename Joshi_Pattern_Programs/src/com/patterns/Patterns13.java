/*
	Enter the size:5
	1 1 1 1 1 
	2 2 2 2 2 
	3 3 3 3 3 
	4 4 4 4 4 
	5 5 5 5 5
 */

package com.patterns;

import java.util.Scanner;

public class Patterns13 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the size:");
		int n=s.nextInt();
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}

}
