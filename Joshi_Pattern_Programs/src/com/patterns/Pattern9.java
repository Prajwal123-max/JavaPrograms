/*
	Enter the num: 5
	01 02 03 04 05 
	02 04 06 08 10 
	03 06 09 12 15 
	04 08 12 16 20 
	05 10 15 20 25
 */

package com.patterns;

import java.util.Scanner;

public class Pattern9 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the size:");
		int n=s.nextInt();

		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				if(i*j < 10){
					System.out.print(0);
				}
				System.out.print(i*j +" ");
			}
			System.out.println();
		}

	}
}
