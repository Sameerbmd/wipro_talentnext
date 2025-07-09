package oopsAndInheritance;
import java.util.*;
public class Ques6String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str =sc.nextLine();
		if(str.charAt(0)=='x' && str.charAt(str.length()-1) =='x') {
			for (int i=1;i<str.length()-1;i++) {
				System.out.print(str.charAt(i));
			}
		}
		else if(str.charAt(0)=='x' ){
			for (int i=1;i<str.length();i++) {
				System.out.print(str.charAt(i));
			}
			
		}
		else if(str.charAt(str.length()-1)=='x' ){
			for (int i=0;i<str.length()-1;i++) {
				System.out.print(str.charAt(i));
			}
			
		}
		else {
			for (int i=0;i<str.length();i++) {
				System.out.print(str.charAt(i));
			}
			
		}
		
	}

}
