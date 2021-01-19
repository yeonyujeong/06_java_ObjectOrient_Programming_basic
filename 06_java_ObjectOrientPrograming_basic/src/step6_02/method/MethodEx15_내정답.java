// 2021.1.15
package step6_02.method;

import java.util.Random;
import java.util.Scanner;

/*
 * # 기억력 게임 : 클래스 + 메서드
 * 1. front 배열 카드 10장을 섞는다.
 * 2. front 배열에서 같은 카드를 골라 카드의 위치를 입력한다.
 * 3. 선택한 2장의 카드가 같은 카드이면, back 배열에 표시한다.
 * 4. 모든 카드가 뒤집히면(back배열의 0이 사라지면) 게임은 종료된다. 
 */

class MemoryGame{
	
	Scanner scan =  new Scanner(System.in);
	Random ran =  new Random();
	
	int[] front = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5 };
	int[] back = new int [10];
	int correctCnt = 0;
	
	void shuffle() {
		
		for (int i = 0; i < 1000; i++) {
			int r = ran.nextInt(10);
			int temp = front[0];
			front[0] = front[r];
			front[r] = temp;
		}
	}
	
	void printCard() {
		
		System.out.print("front = [");
		for (int i = 0; i < front.length; i++) {
			System.out.print(front[i] + " ");
		}
		System.out.println("] ");
		
		System.out.print("back  = [");
		for (int i = 0; i < back.length; i++) {
			System.out.print(back[i] + " ");
		}
		System.out.println("] ");

	}

	void choiceCard() {
		
		System.out.print("카드1 입력 [1~10] : ");
		int card1 =scan.nextInt() - 1;
		System.out.print("카드2 입력 [1~10] : ");
		int card2 =scan.nextInt() - 1;

		if(card1 == card2) {System.out.println("같은 카드를 선택하셨습니다.");}
		else if(front[card1] == front[card2]) {
			back[card1] = front[card1];
			back[card2] = front[card2];
			correctCnt++;
		}
		
	}
	
	void run() {
		
		while(true) {
			shuffle();
			printCard();
			if(correctCnt == 5) {System.out.println("게임종료"); break;}
			choiceCard();
		}
	}
	

	
}

public class MethodEx15_내정답 {

	public static void main(String[] args) {

		MemoryGame g = new MemoryGame();
		g.run();

	}

}
