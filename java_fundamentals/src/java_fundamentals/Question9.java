package java_fundamentals;
import java.util.*;
public class Question9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String gender = sc.nextLine();
		int age =sc.nextInt();
		if (gender == "female") {
			if (age >=1 && age <=58) {
				System.out.println("the rate of interest is 8.2%");
			}
			else {
				System.out.println("the rate of interest is 9.2%");
			}
		}
		else {
			if (age>1 && age <=58 ) {
						System.out.println("the rate of interest is 8.4%");
			}
			else {
						System.out.println("the rate of interest is 9.4%");
			}
		}
	}

}
