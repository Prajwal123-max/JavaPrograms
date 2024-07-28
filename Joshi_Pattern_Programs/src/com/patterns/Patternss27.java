/*
	Enter the size:5
	1
	3 2
	6 5 4
	10 9 8 7
	15 14 13 12 11
 */

package com.patterns;

import java.util.Scanner;

public class Patternss27 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the size:");
		int n=s.nextInt();
		
		for(int i=1; i<=n; i++) {
			int count=i*(i+1)/2;
			for(int j=1; j<=i; j++) {
				System.out.print(count);
				count--;
				if(j!=i) {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
