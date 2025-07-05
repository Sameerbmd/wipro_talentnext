package java_fundamentals;
import java.util.*;
public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		if (a%10 == b%10 ) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
	}

}
