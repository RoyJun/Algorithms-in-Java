package Whilestatement;

import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] A = null;
		int caseNum = sc.nextInt();
		A=new int[caseNum];
		
		for(int i=0; i<caseNum; i++) {
			int B = sc.nextInt();
			int C = sc.nextInt();
			A[i]=B+C;
		}
		for(int i=0; i<caseNum; i++) {
			System.out.println(A[i]);
		}
		

	}

}
