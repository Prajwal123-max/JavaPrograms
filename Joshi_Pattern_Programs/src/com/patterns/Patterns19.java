/*
	Enter the size:5
	1 2 3 4 5 
	2     3 
	3   4 
	4 5 
	5
 */

package com.patterns;

import java.util.Scanner;

public class Patterns19 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the size:");
		int n=s.nextInt();
		
		for(int i=1; i<=n; i++) {
			int count=i;
			for(int j=1; j<=n-i+1; j++) {
				if(i==1||j==1||j==n-i+1) {
					System.out.print(count+" ");
					count++;
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}
