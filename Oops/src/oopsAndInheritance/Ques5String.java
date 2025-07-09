package oopsAndInheritance;
import java.util.*;
public class Ques5String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		String b=sc.nextLine();
		if (a.length()>b.length()) {
			System.out.println(b+a+b);
		}
		else {
		System.out.println(a+b+a);
		}
	}

}
