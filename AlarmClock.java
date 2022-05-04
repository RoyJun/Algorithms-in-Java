package IFstatement;

import java.util.Scanner;

public class AlarmClock {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int AA = A-1;
		int BB = B-45;
		
		if (AA>0) {
		if (BB>=0) {
			System.out.println(A+ " "+BB);
		}else {
			System.out.println(AA+ " " +(60+BB));
		}
		}
		
		else if (AA<0) {
			if (BB>=0) {
				System.out.println(24+AA+ " "+BB);
			}else {
				System.out.println(24+AA+ " " +(60+BB));
			}
		}
		
		else if (AA==0) {
			if (BB>=0) {
				System.out.println(0+ " "+BB);
			}else {
				System.out.println(0+ " " +(60+BB));
			}
		}
		
	}

}
