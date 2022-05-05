package Whilestatement;

import java.util.Scanner;

public class Addition4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		int[] AA = null;
		AA = new int[testCase];
		int A;
		int B;
		
		
		for(int i=0; i<testCase; i++) {
			A = sc.nextInt();
			B = sc.nextInt();
			AA[i]=A+B;
			System.out.println("Case #"+(i+1)+": " + A + " + " + B  + " = "+ AA[i]);
		}
		/*
		for(int i=0; i<testCase; i++) {
			
			
		System.out.println("Case #"+(i+1)+": " + A + " + " + B  + " = "+ AA[i]);
	} */
	}

}
