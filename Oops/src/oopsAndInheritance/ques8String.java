package oopsAndInheritance;

import java.util.Scanner;

public class ques8String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int n=sc.nextInt();
		String str=s.substring(s.length()-n, s.length());
		for(int i=0;i<n;i++) {
			System.out.print(str);
		}
	}

}