package test1;

import java.util.Scanner;

public class bank {
	public static void main(String[] args) {
		int money = 0;
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("-----------------------------------");
			System.out.println("1. 입금 | 2. 출금 | 3. 잔액확인 | 4. 종료");
			System.out.println("-----------------------------------");
			System.out.println("메뉴 선택");
			int choice = sc.nextInt();
			if(choice == 1) {
				System.out.println("입금 금액 입력 >> ");
				int deposit = sc.nextInt();
				money = money + deposit;
				System.out.println("잔액 : >> " + money);
			}
			else if(choice == 2) {
				System.out.println("출금 금액 입력 >> ");
				int withdraw = sc.nextInt();
				if(money > withdraw) {
				money = money - withdraw;
				System.out.println("잔액 >> " + money);
				}else {
					System.out.println("출금할 잔액이 부족합니다");
					System.out.println("다시 시도해주세요");
					continue;
				}
			}
			else if(choice == 3) {
				System.out.println("잔액 확인 >> " + money);
			}
			else if(choice == 4) {
				System.out.println("프로그램 종료");
				System.exit(0);
			}
			
		}
	}

}
