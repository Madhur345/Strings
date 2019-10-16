package com.string.programms;

import java.util.Scanner;

public class StringWordCountInSentence {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sentence");
		String str =sc.nextLine();
		int wc=0;
		char ch[]=str.toCharArray();
		for(int i=0;i<ch.length;i++){
			if(i==0 && ch[i]!=' ' || ch[i]!=' ' && ch[i-1]==' '){
				wc++;
			}
		}
		System.out.println(wc);
	}
}
