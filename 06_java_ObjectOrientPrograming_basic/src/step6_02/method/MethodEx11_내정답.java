package step6_02.method;

// 2021. 1. 15	 12:28 - 12:33

class Ex11{
	
	int test1(int[] arr) {
		int arrSum = 0;
		for (int i = 0; i < arr.length; i++) {
			arrSum += arr[i];
		}
		return  arrSum;
		}
	
	int test2(int[] arr) { 
		int arrSumMultiple4 = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] % 4 == 0) {arrSumMultiple4 += arr[i];}
		}
		return arrSumMultiple4; }
	
	int test3(int[] arr) { 
		int arrCntMultiple4 = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] % 4 == 0) { arrCntMultiple4++;}
		}
		return arrCntMultiple4; }
	
	int test4(int[] arr) { 
		int arrCntEven = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 == 0) {arrCntEven++;}
		}
		return arrCntEven; }

}




public class MethodEx11_내정답 {

	public static void main(String[] args) {

		
			Ex11 e = new Ex11();
			
			int[] arr = {87, 100, 11, 72, 92};
	
			// 문제 1) 전체 합 리턴
			// 정답 1) 362
			int tot = e.test1(arr);
			System.out.println("tot = " + tot);
			
			
			
			// 문제 2) 4의 배수의 합 리턴
			// 정답 2) 264
			tot = e.test2(arr);
			System.out.println("tot = " + tot);
			
			
			
			// 문제 3) 4의 배수의 개수 리턴
			// 정답 3) 3
			int cnt = e.test3(arr);
			System.out.println("cnt = " + cnt);
			
			
			
			// 문제 4) 짝수의 개수 리턴
			// 정답 4) 3
			cnt = e.test4(arr);
			System.out.println("cnt = " + cnt);
		

	}

}
