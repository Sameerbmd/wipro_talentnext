
package abstraction;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("Enter the number of elements in the array:");
			int n=sc.nextInt();
			int[] arr=new int[n];
			System.out.println("enter the elements in the array:");
			for(int i=0;i<n;i++) {
				arr[i]=sc.nextInt();
			}
			System.out.println("enter the index of the array elements you to access:");
			int s=sc.nextInt();
			System.out.println("The array element at index " + s + " = " + arr[s]);
	        System.out.println("The array element successfully accessed");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException");
		}
		catch(Exception e) {
			System.out.println("NumberFormatException");
		}
	}

}
