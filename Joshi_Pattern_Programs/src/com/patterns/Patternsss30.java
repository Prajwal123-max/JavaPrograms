/*
	Enter the size:5
	A 
	C B 
	D E F 
	J I H G 
	K L M N O 
 */

package com.patterns;

import java.util.Scanner;

public class Patternsss30 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the size:");
		int n=s.nextInt();

		char ch='A';
		for(int i=1; i<=n; i++) {
			if(i%2==0) {
				char chaRev=(char)(ch+i-1);
				for(int j=1; j<=i; j++) {
					System.out.print(chaRev+" ");
					chaRev--;
					ch++;
				}
			}
			else {
				for(int j=1; j<=i; j++) {
					System.out.print(ch++ +" ");
				}				
			}
			System.out.println();
		}
	}

}
