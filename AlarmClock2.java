package IFstatement;

import java.util.Scanner;

public class AlarmClock2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		if(B-45>0) {
			System.out.println(A + " " + (B-45));
		}else if (B-45<0) {
			if(A-1>=0) {
			System.out.println(A-1 + " " + (60+(B-45)));
		}
			else if (A-1<0) {
				System.out.println((24+(A-1))+ " " + (60+(B-45)));
			}
		}
		else if (B-45==0) {
			System.out.println(A + " " + (B-45));
		}
	}

}
