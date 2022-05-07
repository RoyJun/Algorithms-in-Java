package practice;

import java.util.Scanner;

public class StarEx2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int count=0;
		
		for(int i=0; i<num; i++) {
			count++;
			for(int b=num; b>count; b--) {
				System.out.print(" ");
				}
			for(int s=0; s<=i; s++) {
				
				System.out.print("*");
			}
			System.out.println();
		

	}

}
}
