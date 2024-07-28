/*
	Enter the size:5
	1
	22
	333
	4444
	55555
	4444
	333
	22
	1
 */

package com.patterns;

import java.util.Scanner;

public class Patternss26 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the size:");
		int n=s.nextInt();
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n-i; j++) {
				System.out.print(n-i);
			}
			System.out.println();
		}
	}

}
