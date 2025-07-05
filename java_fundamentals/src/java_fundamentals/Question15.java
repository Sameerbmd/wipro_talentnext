package java_fundamentals;
import java.util.*;
public class Question15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a= sc.nextInt();
		if (a<=1) {
			System.out.println("Not prime");
		}
		else {
			for (int i=2;i<=a/2;i++) {
				if (a%i==0) {
					System.out.println("Not prime");
					break;
				}
				else {
					System.out.println("prime");
					break;
				}
			}
		}
	}

}
