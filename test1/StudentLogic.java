package test1;
import java.util.Scanner;

public class StudentLogic {
	
		public static void main(String[] args) {
			Scanner sc =new Scanner(System.in);
			int[] score = null;
			while(true) {
			System.out.println("--------------------------------------------");
			System.out.println("1.학생 수|2.점수 입력|3.점수 확인 |4.분석 | 5.종료 ");
			System.out.println("--------------------------------------------");
			System.out.println("메뉴선택>> ");
			int choice = sc.nextInt();
			if(choice == 1) {
				System.out.println( ">> " + choice);
				System.out.println("학생 수 : ");
				int num = sc.nextInt();
				score = new int[num];
			}
			else if(choice == 2) {
				if(score == null) {
					System.out.println("학생 수를 먼저 입력을 해주세요.");
					continue;
				}
				System.out.println( ">> " + choice);
				for(int i = 0; i< score.length; i++) {
					System.out.print(i+1 + ")번 학생의 점수 : ");
					score[i]= sc.nextInt();
				}
			}
			else if(choice == 3) {
				System.out.println( ">> " + choice);
				System.out.println("[ 학생들의 점수 확인 ]");
				for(int i = 0; i < score.length; i++) {
					System.out.print(i+1 + ")번 학생의 점수 : " + score[i]);
					System.out.println();
				}
			}
			else if(choice == 4) {
				System.out.println( ">> " + choice);
				int sum = 0;
				int max =0;
				int min =score[0];
				for(int i = 0; i < score.length; i++) {
					sum = sum + score[i];
					if(score[i] > max ) {
						max = score[i] ;
					}
				}
				for(int i = 0; i < score.length; i++) {	
					if(score[i] < min ) {
						min = score[i] ;
					}
				}
				System.out.println(">> " + choice);
				System.out.println("[ 학생들의 점수 분석 ]");
				System.out.println("최고 점수 : " + max);
				System.out.println("최소 점수 : " + min);
				double avg = sum / score.length;
				System.out.println("평균 점수 : " + avg);
			}
			if(choice == 5) {
				System.out.println(">> " + choice);
				System.out.println("프로그램 종료");
				System.exit(0);
			}
		    }
		}
		}

}
