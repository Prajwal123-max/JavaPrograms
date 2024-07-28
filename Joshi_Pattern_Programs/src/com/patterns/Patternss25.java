/*
	Enter the size:5
	111112
	322222
	333334
	544444
	555556
 */

package com.patterns;

import java.util.Scanner;

public class Patternss25 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the size:");
		int n=s.nextInt();
		
		for(int i=1; i<=n; i++) {
			if(i%2==0) {
				System.out.print(i+1);
			}
			for(int j=1; j<=n; j++) {
				System.out.print(i);
			}
			if(i%2!=0) {
				System.out.print(i+1);
			}
			System.out.println();
		}
	}

}
