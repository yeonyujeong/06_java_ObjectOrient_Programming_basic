package step6_02.method;

// 2021. 1. 14		12:44 - 12:49
class Ex07 {
	
	void printEvenOrOdd(int x) {
		if(x % 2 == 0) {System.out.println("짝수");}
		else {System.out.println("홀수");}
	}
	void sumBetweenValues(int x, int y) {
		int tot = 0;
		for (int i = x; i < y+1; i++) {
			tot += i;
		}
		System.out.println("x부터y까지의 합 : " + tot);
	}

	void printPrimeNums(int primeNumber) {
		
		for (int i = 2; i < primeNumber+1; i++) {
			int cnt = 0;
			for (int j = 1 ; j < i+1 ; j++) {
				if(i % j == 0) {cnt++;}
			}
			if(cnt == 2) {System.out.print(i + " ");}
		}
	}
}


public class MethodEx07_내정답 {

	public static void main(String[] args) {
		
		
			Ex07 e = new Ex07();
			
			// 문제 1) num이 홀수인지 짝수인지 출력하는 메서드
			int num = 19;
			e.printEvenOrOdd(num);
	
			// 문제 2) x부터 y까지의 합을 출력하는 메서드
			int x = 1;
			int y = 10;
			e.sumBetweenValues(x, y);
	
			// 문제3) 2부터 primeNumber까지의 소수를 전부 출력하는 메서드 
			int primeNumber = 20;
			e.printPrimeNums(primeNumber);
		



	}

}
