package practice;

import java.util.Scanner;

public class StraEx1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if(num!=0) {
		for(int i=0; i<num; i++) {
			
			
			for(int q=0; q<=i; q++) {
				
				System.out.print("*");
			}
			System.out.println();
		}
		}else  {
			System.out.println();
		}
		
		

	}

}
