/*
	Enter the size;5
	A 
	A B 
	A B C 
	A B C D 
	A B C D E
*/

package com.patterns;

import java.util.Scanner;

public class Patternss28 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the size;");
		int n=s.nextInt();
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print((char)(j+64)+" ");
			}
			System.out.println();
		}
	}

}


/*--------------------------------------------------
  another way of writting same thing
  -------------------------------------------------
		public class P28 {
			public static void main(String[] args) {
				Scanner s=new Scanner(System.in);
				System.out.print("Enter the num: ");
				int n=s.nextInt();
				
				for(int i=1; i<=n; i++) {
					char ch='A';
					for(int j=1; j<=i; j++) {
						System.out.print(ch+" ");
						ch++;
					}
					System.out.println();
				}
			} 
		}
*/