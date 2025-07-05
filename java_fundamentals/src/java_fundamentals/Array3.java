package java_fundamentals;

import java.util.Scanner;

public class Array3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int size =sc.nextInt();
		int[] arr =new int[size];
		for (int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		int num=sc.nextInt();
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==num) {
				System.out.println("in the array");
				return;
			}
		}
		System.out.println("in the array");
	}

}
