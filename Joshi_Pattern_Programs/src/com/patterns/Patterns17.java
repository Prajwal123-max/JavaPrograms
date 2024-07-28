/*
	Enter the size:5
	    1 
	   1 2 
	  1 2 3 
	 1 2 3 4 
	1 2 3 4 5 
 */

package com.patterns;

import java.util.Scanner;

public class Patterns17 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the size:");
		int n=s.nextInt();
		
		for(int i=1; i<=n; i++) {
			for(int k=1; k<=n-i; k++) {
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
