
package oopsAndInheritance;

import java.util.Scanner;

public class Ques7String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String n="";
		int f=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='*') {
				f=i;
				break;
			}
		}
		int l=f-1,r=f+1;
		for(int i=0;i<s.length();i++) {
			if(i==f||i==l||i==r) {
				continue;
			}
			n+=s.charAt(i);
		}
		System.out.println(n);
	}

}
