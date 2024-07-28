/*
	Enter the size:5
	1 
	1 2 1 
	1 2 3 2 1 
	1 2 3 4 3 2 1 
	1 2 3 4 5 4 3 2 1 
 */

package com.patterns;

import java.util.Scanner;

public class Patternss23 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the size:");
		int n=s.nextInt();
		
		for(int i=1; i<=n; i++) {
			int count=1;
			for(int j=1; j<=2*i-1; j++) {
				if(j<i) {
					System.out.print(count+" ");
					count++;
				}else {
					System.out.print(count+" ");
					count--;
				}
			}
			System.out.println();
		}
	}

}
