package java_fundamentals;
import java.util.*;
public class Question20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int temp =num;
		int rev=0;
		while (num>0) {
			rev=rev*10 +(num%10);
			num=num/10;
		}
		if (temp == rev) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not palindrome");
		}
	}

}
