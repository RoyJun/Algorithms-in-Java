package practice;

import java.util.Scanner;

public class Account1Example {
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean run = true;
		while(run) {
		System.out.println("------------------------------------------");
		System.out.println("1.���»��� | 2.���¸�� | 3.���� | 4.��� | 5.����");
		System.out.println("------------------------------------------");
		System.out.print("����> ");
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
					
					
					
					
					//���»����ϱ�
					public static void createAccount() {
						System.out.println("-------------");
						System.out.println("���»���");
						System.out.println("-------------");
						System.out.print("���¹�ȣ: ");
						String A = sc.next();
						System.out.print("������: ");
						String B = sc.next();
						System.out.print("�ʱ��Աݾ�: ");
						int C = sc.nextInt();
						
					
						Account1 account1 = new Account1(A, B, C);
					}
					private static void accountList() {
						System.out.println("-------------");
						System.out.println("���¸��");
						System.out.println("-------------");
						
					}
					
					//�����ϱ�
					private static void deposit() {
						
					}
					
					//����ϱ�
					private static void withdraw() {
						
					}
					
					//Account �迭���� accountNum�� ������ Account ��ü ã�� 
					private static Account findAccount(String accounNum) {
						
					}
			

	}

}
}