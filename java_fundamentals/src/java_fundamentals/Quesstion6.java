package java_fundamentals;
import java.util.*;

public class Quesstion6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		String str = sc.nextLine().replace(" ", ",");
		if (str.length()==0) {
			System.out.println("no values");
		}
		else {
			System.out.println(str);
		}
		
	}

}
