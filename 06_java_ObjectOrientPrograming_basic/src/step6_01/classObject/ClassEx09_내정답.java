package step6_01.classObject;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
 * # 기억력 게임 : 클래스 + 변수
 * 1. front 배열 카드 10장을 섞는다.
 * 2. front 배열에서 같은 카드를 골라 카드의 위치를 입력한다.
 * 3. 선택한 2장의 카드가 같은 카드이면, back 배열에 표시한다.
 * 4. 모든 카드가 뒤집히면(back배열의 0이 사라지면) 게임은 종료된다. 
 */

// 2021.1.12	12:32 - 12:42
class Ex09{
	
	int[] front = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5};
	int[] back = new int[10];
	int answerCnt = 0;		
	
}

//○□△♤◇■
public class ClassEx09_내정답 {

	public static void main(String[] args) {
		
		
	Random ran = new Random();
	Scanner scan = new Scanner(System.in);
	Ex09 e = new Ex09();
	
	int i = 0;
	while(i<1000) {
		int rNum = ran.nextInt(10);
		int temp = e.front[0];
		e.front[0] = e.front[rNum];
		e.front[rNum] = temp;
		i++;
	}

	while(true) {
		
		for (int j = 0; j < e.front.length; j++) {
			if(e.front[j] == 1) {System.out.print("○ \t");}
			else if(e.front[j] == 2) {System.out.print("□ \t");}
			else if(e.front[j] == 3) {System.out.print("△ \t");}
			else if(e.front[j] == 4) {System.out.print("♤ \t");}
			else if(e.front[j] == 5) {System.out.print("◇ \t");}
		}
		
		System.out.println();
		for (int j = 0; j < e.back.length; j++) {
			if(e.back[j] == 1) {System.out.print("○ \t");}
			else if(e.back[j] == 2) {System.out.print("□ \t");}
			else if(e.back[j] == 3) {System.out.print("△ \t");}
			else if(e.back[j] == 4) {System.out.print("♤ \t");}
			else if(e.back[j] == 5) {System.out.print("◇ \t");}
			else if(e.back[j] == 0) {System.out.print("■ \t");}
		}
		System.out.println();
		System.out.print("인덱스1 입력 : ");
		int idx1 = scan.nextInt();
		System.out.print("인덱스2 입력 : ");
		int idx2 = scan.nextInt();
		
		if(idx1 < 0 || idx1 >9 || idx2 < 0 || idx2 > 9) {
			System.out.println("다시 입력해주세요");
			continue;
		}
		
		for (int j = 0; j < e.front.length; j++) {
			if(e.back[idx1] == 0 && e.front[idx1] == e.front[idx2]) {
				e.back[idx1] = e.front[idx1]; 
				e.back[idx2] = e.front[idx2]; 
				e.answerCnt++;
			}
		}
		
		if(e.answerCnt == 5) {
			System.out.println("게임 종료");
			break;
		}
		
		
		
	}
	scan.close();

	}

}
