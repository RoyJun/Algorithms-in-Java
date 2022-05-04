package IFstatement;

import java.util.Scanner;

public class OvenClock {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hours = sc.nextInt();
		int minutes = sc.nextInt();
		int CookingTime = sc.nextInt();
		
		int A = CookingTime%60; // √÷¡æ ∫–
		
		int B = CookingTime/60;
		int C = CookingTime%60;
		
		System.out.println(80/60);
		
		if(minutes<60) {
			System.out.println(hours+ " " +A);
		}else if(minutes>60) {
			if((hours+B)>=24) {
				System.out.println((hours+B)-24+ " " + C);
			}
			else if((hours+B)<24) {
				System.out.println((hours+B)+ " " + C);
			}
			
		}
		
		

	}

}
