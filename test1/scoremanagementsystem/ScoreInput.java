package scoremanagementsystem;

import java.util.Scanner;

public class ScoreInput {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("-----------------------------------");
			System.out.println("1.학생 추가  | 2. 성적 입력 ");
			System.out.println("3. 성적 조회 | 4. 전체 평균 조회 | 0. 종료");
			System.out.println("-----------------------------------");
			int choice = sc.nextInt();
			if(choice == 1) {
				System.out.println("학생 이름 입력 : ");
				String name = sc.nextLine();
				
			}
			
		}
	}

}
