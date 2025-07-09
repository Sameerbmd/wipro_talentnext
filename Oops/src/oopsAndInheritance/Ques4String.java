package oopsAndInheritance;
import java.util.*;

public class Ques4String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		if (str.length()%2==0) {
			for(int i=0;i<str.length()/2;i++) {
				System.out.print(str.charAt(i));
			}
			
		}
		else {
			System.out.println("null");
		}
	}

}
