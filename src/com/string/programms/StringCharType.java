package com.string.programms;

import java.util.Scanner;

public class StringCharType {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sentence");
		String str = sc.nextLine();
		int vc=0,cc=0,uc=0,lc=0,dc=0,spc=0;

		for(int i=0;i<str.length();i++){
			char ch = str.charAt(i);
			if(ch>='A' && ch<='Z'){
				uc++;
				if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
					vc++;
				}
				else{
					cc++;
				}
			}
			else if(ch>='a' && ch<='z'){
				lc++;
				if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
					vc++;
				}
				else{
					cc++;
				}
			}
			else if(ch>='0' && ch <='9'){
				dc++;
			}
			else{
				spc++;
			}
		}
		System.out.println("upper case : " + uc );
		System.out.println("lower case : " + lc );
		System.out.println("vowel case : " + vc );
		System.out.println("constant case : " + cc );
		System.out.println("digit case : " + dc );
		System.out.println("special character case : " + spc );
	}
}
