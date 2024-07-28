/*
	Enter the num; 5
	1 2 3 4 5 
	1 2 3 4 5 
	1 2 3 4 5 
	1 2 3 4 5 
	1 2 3 4 5 
 */

package com.patterns;

import java.util.Scanner;

public class Patterns14 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the size:");
		int n=s.nextInt();
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
