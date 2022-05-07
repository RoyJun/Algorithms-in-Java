package practice;

import java.util.Scanner;

public class Account1Example {
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean run = true;
		while(run) {
		System.out.println("------------------------------------------");
		System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
		System.out.println("------------------------------------------");
		System.out.print("선택> ");
		int num = scanner.nextInt();
			
			switch(num) {
				case 1:
					createAccount();
					break;
					
				case 2:
					accountList();
					break;
					
				case 3:
					deposit();
					break;
					
				case 4:
					withdraw();
					break;
				
				case 5:
					run=false;
			}
					
					
					
					
					//계좌생성하기
					public static void createAccount() {
						System.out.println("-------------");
						System.out.println("계좌생성");
						System.out.println("-------------");
						System.out.print("계좌번호: ");
						String A = sc.next();
						System.out.print("계좌주: ");
						String B = sc.next();
						System.out.print("초기입금액: ");
						int C = sc.nextInt();
						
					
						Account1 account1 = new Account1(A, B, C);
					}
					private static void accountList() {
						System.out.println("-------------");
						System.out.println("계좌목록");
						System.out.println("-------------");
						
					}
					
					//예금하기
					private static void deposit() {
						
					}
					
					//출금하기
					private static void withdraw() {
						
					}
					
					//Account 배열에서 accountNum와 동일한 Account 객체 찾기 
					private static Account findAccount(String accounNum) {
						
					}
			

	}

}
}