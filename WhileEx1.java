package Whilestatement;

import java.util.Scanner;

public class WhileEx1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int i;
		for(i=1; i<10; i++) {
			System.out.println(num+" * "+i+" = "+num*i);
		}
}
}
