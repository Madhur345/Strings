package com.string.programms;

import java.util.Scanner;

public class StringCharCountInWord {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sentence");
		String str = sc.nextLine();
		char ch[]=str.toCharArray();
		for(int i=0;i<ch.length;i++){
			String w="";
			while(i<ch.length && ch[i]!=' '){
				w=w+ch[i];
				i++;
			}
			if(w.length()>0){
				System.out.println(w+"------------> "+w.length());
			}
		}
	}
}
