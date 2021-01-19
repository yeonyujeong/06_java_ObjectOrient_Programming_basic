package step6_01.classObject;
/* 
 * # 1 to 50[3단계] : 1 to 18
 * 1. 구글에서 1 to 50 이라고 검색한다.
 * 2. 1 to 50 순발력 게임을 선택해 게임을 실습해본다.
 * 3. 위 게임을 숫자범위를 좁혀 1 to 18로 직접 구현한다.
 * 4. 숫자 1~9는 front 배열에 저장하고,
 *    숫자 10~18은 back 배열에 저장한다.
 */

import java.util.Random;
import java.util.Scanner;

// 2021.1.13	12:36 - 12:48

class Ex13{
	final int SIZE = 9;
	
	int[] front = new int[SIZE];
	int[] back  = new int[SIZE];
}



public class ClassEx13_내정답 {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	Random ran = new Random();
	Ex13 e = new Ex13();
	
		int [] temp = new int [e.SIZE];
		int cnt = 0;
		while(cnt < 9) {
			int rNum = ran.nextInt(9)+ 1;
			if(temp[rNum - 1] == 0) { e.front[cnt] = rNum; temp[rNum - 1] = 1; cnt++;}
		}
		
		for (int i = 0; i < e.SIZE; i++) {
			e.back[i] = e.front[i] + 9;
		}
		
		int num = 1;
		while(true) {
			for (int i = 0; i < e.SIZE; i++) {
				if(e.front[i] == 0) {System.out.print(" " + "\t");}
				else{System.out.print(e.front[i] + "\t");}
				if(i % 3 == 2) {System.out.println("\n");}
			}
			
			
			System.out.print("인덱스 입력 : ");
			int idx = scan.nextInt();
			
			if(e.front[idx] == num) {
				if(num < 10) {e.front[idx] = e.back[idx];}
				else {e.front[idx] = 0;}
				num++;
			}
			
			if(num == 19) {System.out.println("게임종료"); break;}
			
		}
	
		
		
	}

}
