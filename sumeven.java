package java_milestone;

import java.util.Scanner;


public class sumeven {

	

	void sumeven(int n) {

		int sum=0;

		for(int i=2;i<n;i=i+2) {

			sum=sum+i;

			

		}

		System.out.println(sum);

		

	}

	public static void main(String args[]) {

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter a number");

		int n =sc.nextInt();

		new sumeven ().sumeven(n);



		sc.close();

	}
}
