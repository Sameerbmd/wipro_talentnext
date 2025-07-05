package java_fundamentals;
import java.util.Scanner;
public class Array4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Scanner sc = new Scanner(System.in);

		        int n = sc.nextInt();

		        int arr[] = new int[n];
		        System.out.println("Enter array elements:");
		        for (int i = 0; i < n; i++) {
		            arr[i] = sc.nextInt();
		        }

		        System.out.println("Unique elements:");
		        for (int i = 0; i < n; i++) {
		            int j;
		            for (j = 0; j < i; j++) {
		                if (arr[i] == arr[j]) {
		                    break;
		                }
		            }
		            if (i == j) {
		                System.out.print(arr[i] + " ");
		            }
		        }
		    

	}

}
