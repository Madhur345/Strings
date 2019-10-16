package com.string.programms;

import java.util.Scanner;

public class StringPangram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sentence");
		String str=sc.nextLine();
		boolean fs=isPangram(str);
		if(fs){
			System.out.println("String is Pangram");
		}
		else{
			System.out.println("String is not Pangram");
		}
	}

	static boolean isPangram(String s1){
		if(s1.length()<26){
			return false;
		}
		
		int c1[]=new int[26];
		for(int i=0;i<s1.length();i++){
			char ch=s1.charAt(i);
			if(ch>='A' && ch<='Z'){
				c1[ch-65]++;
			}
			else if(ch>='a' && ch<='z'){
				c1[ch-97]++;
			}
		}
		for(int i=0;i<c1.length;i++){
			if(c1[i]==0){
				return false;
			}
		}
		return true;
	}
}
