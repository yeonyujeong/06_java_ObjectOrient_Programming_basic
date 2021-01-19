package step6_01.classObject;

import java.util.Arrays;
import java.util.Scanner;

/*
 * # 숫자이동[3단계] : 클래스 + 변수
 * 1. 숫자2는 캐릭터이다.
 * 2. 숫자1을 입력하면, 캐릭터가 왼쪽으로
 * 	    숫자2를 입력하면, 캐릭터가 오른쪽으로 이동한다.
 * 3. 숫자 1은 벽이다. 벽을 만나면 이동할 수 없다.
 * 4. 단, 숫자3을 입력하면, 벽을 격파할 수 있다.
 * 5. 좌우 끝에 도달해도 계속 반대편으로 이동이 가능하다.
 * 예) 
 *  0 0 0 0 0 0 0 2 
 *  왼쪽(1) 오른쪽(2) : 2
 *  
 *  2 0 0 0 0 0 0 0 
 */

// 2021.1.11  2:48 - 2:58
class Ex08{
	int[] game = {0, 0, 1, 0, 2, 0, 0, 1, 0};
}

public class ClassEx08_내정답 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Ex08 e = new Ex08();
		
		while(true) {
			System.out.println(Arrays.toString(e.game));
			System.out.print("1.left / 2.right  : ");
			int select = scan.nextInt();
			int idx = -1;
			
			for (int i = 0; i < e.game.length; i++) {
				if(e.game[i] == 2) {idx = i;}
			}
			
			if(select == 1) {
				if(idx <= 0) {continue;}
				if(e.game[idx - 1] == 1) {
					System.out.print("3.punch : ");
					int punch = scan.nextInt();
					if(punch == 3) {e.game[idx-1] = 0;}
					else {continue;}
				}
				e.game[idx] = 0;
				e.game[idx - 1] = 2;
			}
			else if(select == 2) {
				if(idx >= 8) {continue;}
				if(e.game[idx + 1] == 1) {
					System.out.print("3.punch : ");
					int punch = scan.nextInt();
					if(punch == 3) {e.game[idx+1] = 0;}
					else {continue;}
				}
				e.game[idx] = 0;
				e.game[idx + 1] = 2;
			}
			else {System.out.println("다시 선택해주세요");}
			
			
			
		}
		
	}

}
