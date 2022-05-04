package IFstatement;

import java.util.Scanner;

public class OvenClock2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hours = sc.nextInt();
		int minutes = sc.nextInt();
		int CookingTime = sc.nextInt();
		
		int sum = minutes+CookingTime;
		int FinalMin = (minutes+CookingTime)%60;
		int FinalHours = hours+(minutes+CookingTime)/60;
		
		if(sum<60) {
			System.out.println(hours+ " " +sum);
		}else if(sum>=60) {
			if(FinalHours>=24) {
				System.out.println(FinalHours-24+ " " + FinalMin);
			}
			else if(FinalHours<=24) {
				System.out.println(FinalHours+ " "+ FinalMin);
			}
			
		}
		
		

	}

}
