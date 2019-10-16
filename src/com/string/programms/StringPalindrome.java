package com.string.programms;

import java.util.Scanner;

public class StringPalindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sentence");
		String str = sc.nextLine();
		boolean fs =isPalindrome(str);
		if(fs){
			System.out.println("Strings are palindrome");
		}
		else{
			System.out.println("Strings are not palindrome");
		}
	}
	static boolean isPalindrome(String str){
		String rev="";
		for(int i=str.length()-1;i>=0;i--){
			char ch = str.charAt(i);
			rev=rev+ch;
		}
		boolean fs=rev.equals(str);
		return fs;
		//		if(!rev.equals(str)){
		//			return false;
		//		}
		//		return true;
	}
}
