package step6_01.classObject;

import java.util.Scanner;

/*
 * # 학생성적 관리 프로그램[3단계] : 클래스 + 변수
 * 1. 학번을 입력하면, 해당 학생의 성적이 출력된다.
 * 2. 단, 없는 학번 입력에 관한 예외상황을 반드시 처리해야 한다.
 * 3. 1등과 꼴등 학생의 정보를 확인할 수 있다.
 */

// 2021.1.11 	1:42 - 1:57

class Ex05{
	
	String name = "";
	
	int[] arHakbun = {1001, 1002, 1003, 1004, 1005};
	int[] arScore  = {  92,   38,   87,  100,   11};

}

public class ClassEx05_내정답 {

	public static void main(String[] args) {

		
		Scanner scan = new Scanner(System.in);

		Ex05 mega = new Ex05();
		mega.name = "메가IT 고등학교";
		
		while (true) {
			
			System.out.println("=== " + mega.name + "===");
			System.out.println("1.전교생 성적확인");
			System.out.println("2.1등학생 성적확인");
			System.out.println("3.꼴등학생 성적확인");
			System.out.println("4.성적확인하기");
			System.out.println("5.종료하기");
			
			System.out.print("메뉴 선택 : ");
			int choice = scan.nextInt();
			
			int cnt = mega.arHakbun.length;
			int tot = 0;
			int maxScore = 0;
			int maxIdx = -1;
			int minScore = 101;
			int minIdx = -1;
			for (int i = 0; i < mega.arScore.length; i++) {
				tot += mega.arScore[i];
				if(mega.arScore[i] > maxScore) {maxScore = mega.arScore[i]; maxIdx = i;}
				if(mega.arScore[i] < minScore) {minScore = mega.arScore[i]; minIdx = i;}
			}
			double avg = tot / mega.arScore.length;
			
			
			
			if		(choice == 1) {
				
				System.out.println("전교생 수 :" + cnt + "명");
				System.out.println("총점 : " + tot + "점");
				System.out.println("평균 : " + avg + "점");
				System.out.println();
			}	
			else if (choice == 2) {
				System.out.println("[ 1등 ]");
				System.out.println("학번 : " + mega.arHakbun[maxIdx]);
				System.out.println("성적 : " + mega.arScore[maxIdx] + "점");
				System.out.println();
			}
			else if (choice == 3) {
				System.out.println("[ 꼴등 ]");
				System.out.println("학번 : " + mega.arHakbun[minIdx]);
				System.out.println("성적 : " + mega.arScore[minIdx] + "점");
				System.out.println();
			}
			else if (choice == 4) {
				System.out.println("학번을 입력하세요 : ");
				int hak = scan.nextInt();
				int hakIdx = -1;
				for (int i = 0; i < mega.arHakbun.length; i++) {
					if(hak == mega.arHakbun[i]) {hakIdx = i;}
				}
				if(hakIdx != -1) {System.out.println(mega.arHakbun[hakIdx] + "학번 학생의 성적은" + mega.arScore[hakIdx] +"점입니다.");}
				else {System.out.println("입력하신 학번은 존재하지 않습니다.");}
				System.out.println();
			}
			else if (choice == 5) {
				System.out.println("프로그램 종료");
				break;
			}
		}

	}

}
