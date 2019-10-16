package com.string.programms;

import java.util.Scanner;

public class StringReverseSentence {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sentence");
		String str = sc.nextLine();
		String rs="";
		char ch[]=str.toCharArray();
		for(int i=ch.length-1;i>=0;i--){
			int j=i;
			while(i>=0 && ch[i]!=' '){
				i--;
			}
			int k=i+1;
			while(k<=j){
				rs=rs+ch[k];
				k++;
			}
			if(i>0){
				rs=rs+ch[i];
			}
		}
		System.out.println(rs);
	}
}
