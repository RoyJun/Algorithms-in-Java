package IFstatement;

import java.util.Scanner;

public class Dice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int First = sc.nextInt();
		int Second = sc.nextInt();
		int Third = sc.nextInt();
		
		
		if(First==Second && Second==Third) {
			System.out.println(10000+First*1000);
		}
		else if(First==Second || Second==Third || First==Third) {
			if(First==Second) {
				System.out.println(1000+First*100);
			}
			else if(Second==Third) {
				System.out.println(1000+Second*100);
			}
			else if(First==Third) {
				System.out.println(1000+First*100);
			}
		}
		else {
			int Max;
			
			if(First>Second) {
				if(First>Third) {
					Max=First;
				}
				else {
					Max=Third;
				}
				System.out.println(Max*100);
			}
				
			else if(Second>Third) {
				if(Second>First) {
					Max=Second;
				}
				else {
					Max=First;
				}
				System.out.println(Max*100);
			}
			else if(Third>First) {
				if(Third>Second) {
					Max=Third;
				}
				else {
					Max=Second;
				}
				System.out.println(Max*100);
			}
			
	}

}
}
