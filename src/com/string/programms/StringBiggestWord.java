package com.string.programms;

import java.util.Scanner;

public class StringBiggestWord {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sentence");
		String str=sc.nextLine();
		String bw="";
		String sw=str;
		char ch[]=str.toCharArray();
		for(int i=0;i<ch.length;i++){
			String w="";
			while(i<ch.length && ch[i]!=' '){
				w=w+ch[i];
				i++;
			}
			if(bw.length()<w.length()){
				bw=w;
			}
			else if(sw.length()>w.length()){
				sw=w;
			}
		}
		System.out.println("Biggest word ----------" + bw);
		System.out.println("smallest word ----------" + sw);
	}
}
