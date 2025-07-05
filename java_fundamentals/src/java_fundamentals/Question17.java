package java_fundamentals;
import java.util.*;
public class Question17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num= sc.nextInt();
		int sum=0;
		for (int i=num;i>0;i=i/10) {
			sum+=i%10;
			
		}
		System.out.println(sum);
	}

}
