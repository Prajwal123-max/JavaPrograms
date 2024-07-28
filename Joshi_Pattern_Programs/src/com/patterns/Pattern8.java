/*
	Enter the num: 5
	* * * * * 
	 *     * 
	  *   * 
	   * * 
	    * 
 */
package com.patterns;

import java.util.Scanner;

public class Pattern8 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the size:");
		int n=s.nextInt();
		
		for(int i=1; i<=n; i++) {
			for(int k=1; k<=i-1; k++) {
				System.out.print(" ");
			}
			for(int j=1; j<=n-i+1; j++) {
				if(i==1||j==1||j==n-i+1) {
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
