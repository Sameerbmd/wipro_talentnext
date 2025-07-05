package java_fundamentals;
import java.util.*;
public class Question7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		char first = sc.next().charAt(0);
		char sec =sc.next().charAt(0);
		if (first<sec) {
			System.out.println(sec +" "+first);
		}
		else {
			System.out.println(first+" "+sec);
		}
	}

}
