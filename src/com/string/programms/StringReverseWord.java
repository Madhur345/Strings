package com.string.programms;

import java.util.Scanner;

public class StringReverseWord {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sentence");
		String str=sc.nextLine();
		char ch[]=str.toCharArray();
		String rev="";
		for(int i=0;i<ch.length;i++){
			int j=i;
			while(i<ch.length && ch[i]!=' '){
				i++;
			}
			int k=i-1;
			while(k>=j){
				rev =rev+ch[k];
				k--;
			}
			if(i<ch.length){
				rev =rev+ch[i];
			}
		}
		System.out.println(rev);
	}
}
