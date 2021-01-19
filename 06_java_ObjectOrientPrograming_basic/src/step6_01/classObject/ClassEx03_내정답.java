package step6_01.classObject;

//# 학생성적관리 프로그램[1단계] : 클래스 + 변수

class Ex03{
	int[] arr = {87, 100, 11, 72, 92};
}



public class ClassEx03_내정답 {	// 2021.1.11	1:20 - 1:25

	public static void main(String[] args) {
		
		// 문제 1) 전체 합 출력
		// 정답 1) 362
		
		Ex03 e = new Ex03();
		
		int tot = 0;
		for (int i = 0; i < e.arr.length; i++) {
			tot += e.arr[i];
		}
		System.out.println("합 : " + tot);
		
		// 문제 2) 4의 배수의 합 출력
		// 정답 2) 264
		
		int tot4 = 0;
		
		for (int i = 0; i < e.arr.length; i++) {
			if(e.arr[i] % 4 == 0) {
				tot4 += e.arr[i];
			}
		}
		System.out.println("4의배수의합 : " + tot4);
		// 문제 3) 4의 배수의 개수 출력
		// 정답 3) 3
		
		int cnt = 0;
		
		for (int i = 0; i < e.arr.length; i++) {
			if(e.arr[i] % 4 == 0) {
				cnt++;
			}
		}
		System.out.println("4의배수의 개수 :" + cnt);
		// 문제 4) 짝수의 개수 출력
		// 정답 4) 3

		int jjak = 0;
		
		for (int i = 0; i < e.arr.length; i++) {
			if(e.arr[i] % 2 == 0) {
				jjak++;
			}
		}
		System.out.println("짝수의 개수 :" + jjak);
	}

}
