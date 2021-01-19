package step6_01.classObject;
/*
 * # 영수증 출력하기 : 클래스 + 변수
 * 1. 햄버거 주문을 받아 영수증을 출력한다.
 * 2. 출력내용은 각 메뉴의 주문 수량과 총 금액 및 잔돈을 표시한다.
 * 
 * 	맘스터치
 *----------------------
 *ITEM	QTY	AMT
 *치즈버거	1	2500
 *불고기버거	1	3800
 *감자튀김	1	1500
 *콜      라	1	1000
 *----------------------
 *합계금액		8800
 *받은금액		10000
 *----------------------
 *잔       돈		1200
 */

//2021.1.12		1:09 - 1:25
import java.util.Scanner;

class Ex10 {
	String name = "";		// 가게 이름
	
	int[] arPrice   = {    2500,       3800,     1500,  1000};
	String[] arMenu = {"치즈버거", "불고기버거", "감자튀김", "콜      라"};
	
	int[] arCount = new int[4];
	
	int total = 0;
}



public class ClassEx10_내정답 {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	Ex10 e = new Ex10();
	
	e.name = "맘스터치";
	int size = 4;	
	while(true) {
	
		System.out.println("[ 맘스터치 햄버거 ]");
		for (int i = 0; i < size; i++) {
			System.out.print((i+1) + "." + e.arMenu[i] + "\t" + e.arPrice[i] + "원 \n" );
		}
		System.out.println("-------------------");
		System.out.println("1.주문 하기");
		System.out.println("2.주문 종료");
		System.out.print("선택 : ");
		int select = scan.nextInt();
		
		if(select == 1) {
			System.out.println("메뉴 선택 : ");
			int menu = scan.nextInt();	
			if(menu == 1) {e.arCount[0]++;}
			else if(menu == 2) {e.arCount[1]++;}
			else if(menu == 3) {e.arCount[2]++;}
			else if(menu == 4) {e.arCount[3]++;}
		}
		
		else if(select == 2) {
			int tot = 0;
			for (int i = 0; i < size; i++) {tot += e.arCount[i]*e.arPrice[i];}			
			System.out.println("총 금액 : " + tot + "원");
			
			System.out.print("현금을 입력하세요 : ");
			int money = scan.nextInt();
			if(money < tot) {System.out.println("현금이 부족합니다."); continue;}
			else {
				int change = money - tot;
				System.out.println("[ 영수증 ] ");
				for (int i = 0; i < size; i++) {
					System.out.print((i+1) + "." + e.arMenu[i] + "\t" + e.arCount[i] + "개 " + "\t" + e.arCount[i]*e.arPrice[i] +"원 \n");
				}
				System.out.println("현   금 : " + money + "원");
				System.out.println("총 금액 : " + tot + "원");
				System.out.println("잔   돈 : " + change + "원");
				break;
			}
		}
		
	}	
		
		
	scan.close();	
	}

}
