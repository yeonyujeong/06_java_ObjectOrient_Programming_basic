package step6_02.method;
// 2021.1.14	12:32 - 12:38

import java.util.Scanner;

class Ex05{

	void test1() {
		int tot = 0;
		for (int i = 1; i < 6; i++) {
			tot += i;
		}
		System.out.println("1부터5까지의 합 : " + tot);
	}
	
	void test2() {
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[3];
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			System.out.print("정수입력" + (i+1) + ":" );
			arr[i] = scan.nextInt();
			if(arr[i] > max) {max = arr[i];}
		}
		System.out.println("최대값 : " + max);
		
		scan.close();
	}
	
}


public class MethodEx05_내정답 {

	public static void main(String[] args) {

		
			Ex05 e = new Ex05();
						
			// 문제 1) 1부터 5까지의 합을 출력하는 메서드
			e.test1();
			System.out.println();
			
			// 문제 2) 정수 3개를 배열에 입력받아 최대값을 출력하는 메서드
			e.test2();
		


	}

}
