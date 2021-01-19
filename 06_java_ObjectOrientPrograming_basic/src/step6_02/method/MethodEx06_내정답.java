package step6_02.method;

import java.util.Arrays;

// 2021.1.14	12:39 - 12:43

class Ex06{
	
	void test1(int x, int y) {
		int tot = 0;
		for (int i = x; i < y+1; i++) {
			tot += i;
		}
		System.out.println("x부터 y까지의 합 : " + tot);
	}
	
	void test2(int[] arr) {
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] > max) {max = arr[i];}
		}
		System.out.println("최대값 : " + max);
	}
	
	void test3(int[] arr, int idx1, int idx2) {
		System.out.println(Arrays.toString(arr));
		int temp = 0;
		temp = arr[idx1];
		arr[idx1] = arr[idx2];
		arr[idx2] = temp;
		System.out.println(Arrays.toString(arr));
		
	}
	
}


public class MethodEx06_내정답 {

	public static void main(String[] args) {
		
		
			Ex06 e = new Ex06();
			
			// 문제 1) x부터 y까지의 합을 출력하는 메서드
			int x = 1;
			int y = 10;
			e.test1(x, y);
			System.out.println();
			
			// 문제 2) arr배열을 전달받아 최대값을 출력하는 메서드
			int[] arr = {87, 100, 35, 12, 46};
			e.test2(arr);
			System.out.println();
			
			// 문제 3) arr배열과 idx1 , idx2를 전달받아 idx1번째와 idx2번째를 교체한뒤 출력하는 메서드
			int idx1 = 1;
			int idx2 = 4;
			e.test3(arr, idx1, idx2);
			

	}

}
