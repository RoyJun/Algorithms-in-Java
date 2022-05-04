package IFstatement;

import java.util.Scanner;

public class IFstatementEx1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int scores = sc.nextInt();
		if(scores<=100 && scores>=90) {
			System.out.println("A");
		} else if (scores<=89 && scores>=80) {
			System.out.println("B");
		} else if (scores<=79 && scores>=70) {
			System.out.println("C");
		} else if (scores<=69 && scores>=60) {
			System.out.println("D");	
		} else {
			System.out.println("F");
		}
			
	}

}
