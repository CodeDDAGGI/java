package game;

import java.util.Scanner;

public class CharacterGenerate {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String name;
	String gender;
	while(true) {
	System.out.println("----------------------------------");
	System.out.println("이름을 작성해주시오.");
	System.out.println("----------------------------------");
	name = sc.nextLine();
	System.out.println("----------------------------------");
	System.out.println(name + "이 맞습니까?(확정 1,다시 2)");
	System.out.println("----------------------------------");
	
	int nameSave = sc.nextInt();
	sc.nextLine();
	
	if(nameSave == 1) {
		System.out.println("----------------------------------");
		System.out.println("캐릭터의 성별을 정하세요. ");
		System.out.println("남자 / 여자");
		System.out.println("----------------------------------");
		gender = sc.nextLine();
		
			if(gender.equals("남자")) {
				System.out.println("----------------------------------");
				System.out.println("남자로 설정하겠습니다");
				System.out.println("----------------------------------");
				CharacterGenerateSave character = new CharacterGenerateSave(name, gender);
				System.out.println("정보가 추가되었습니다.");
				break;
				
				
			}else if(gender.equals("여자")) {
				System.out.println("----------------------------------");
				System.out.println("여자로 설정하겠습니다");
				System.out.println("----------------------------------");
				CharacterGenerateSave character = new CharacterGenerateSave(name, gender);
				System.out.println("정보가 추가되었습니다.");
				break;
			}
			else {
				System.out.println("----------------------------------");
				System.out.println("올바른 성별을 선택하여 주시기 바랍니다");
				System.out.println("----------------------------------");
				continue;
			}
			
			
		}else if(nameSave == 2) {
			System.out.println("----------------------------------");
			System.out.println("캐릭터를 다시 생성합니다");
			System.out.println("----------------------------------");
			continue;
		}else {
			System.out.println("----------------------------------");
			System.out.println("올바른 선택이 아닙니다.");
			System.out.println("----------------------------------");
			continue;
		}
	 }
	}
	
}


