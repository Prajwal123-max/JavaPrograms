/*
	Enter the num: 5
	    * 
	   * * 
	  *   * 
	 *     * 
	* * * * *
 */
package com.patterns;

import java.util.Scanner;

public class Pattern7 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the size:");
		int n=s.nextInt();
		
		for(int i=1; i<=n; i++) {
			for(int k=1; k<=n-i; k++) {
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) {
				if(j==1||i==n||j==i) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}
