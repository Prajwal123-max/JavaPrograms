/*
	Enter the size:5
	    * * * * * 
	   * * * * * 
	  * * * * * 
	 * * * * * 
	* * * * * 
 */

package com.patterns;

import java.util.Scanner;

public class Patterns11 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the size:");
		int n=s.nextInt();
		
		for(int i=1; i<=n; i++) {
			for(int k=1; k<=n-i; k++) {
				System.out.print(" ");
			}
			for(int j=1; j<=n; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
