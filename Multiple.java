package Fundamentalarithmeticoperations;

import java.util.Scanner;

public class Multiple {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		/*
		int A = sc.nextInt();
		int B = sc.nextInt();
		int aa = A*(B-((B/10)*10));
		int bb = A*((B-(B/100*100))/10*10/10)*10;
		int cc = A*(B/100)*100;
		
		
		System.out.println(A*(B-((B/10)*10)));
		System.out.println(A*((B-(B/100*100))/10*10/10));
		System.out.println(A*(B/100));
		
		System.out.println(aa+bb+cc);
		*/
		
		/*
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		System.out.println(A*(B%10));
		System.out.println(A*((B-B%10)-B/100*100)/10);
		System.out.println(A*(B-B%100)/100);
		*/
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int AA = B%1000;
		int BB = B%100;
		int CC = B%10;
		
		int AAA=AA-BB;
		int BBB=BB-CC;
		
		System.out.println(A*CC);
		System.out.println(A*BBB/10);
		System.out.println(A*AAA/100);
		System.out.println(A*B);

	}

}
