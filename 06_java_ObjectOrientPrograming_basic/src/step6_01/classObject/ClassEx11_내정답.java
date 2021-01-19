package step6_01.classObject;
/*
 * # ATM[4단계] : 전체 기능구현
 * 1. 회원가입
 * . id와 pw를 입력받아 가입
 * . 가입 시 돈 1000원 부여
 * . id 중복체크
 * 2. 회원탈퇴
 * . 로그인시에만 이용가능
 * 3. 로그인
 * . id와 pw를 입력받아 로그인
 * . 로그아웃 상태에서만 이용가능
 * 4. 로그아웃
 * . 로그인시에만 이용가능
 * 5. 입금
 * . 로그인시에만 이용가능
 * 6. 이체
 * . 로그인시에만 이용가능
 * 7. 잔액조회
 * . 로그인시에만 이용가능
 */

// 2021.1.12 	1:27 - 1:55
import java.util.Scanner;


class Ex11{
	String name = "";
	
	String[] arAcc = new String[5];
	String[] arPw  = new String[5];
	int[] arMoney  = new int[5];
	
	int accCnt = 0;
	int identifier = -1;
}


public class ClassEx11_내정답 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		Ex11 e = new Ex11();
		e.name = "Mega Bank";
		
		while (true) {
			
			if(e.accCnt > 0) {
				for (int i = 0; i < e.accCnt; i++) {
					System.out.println("[" + i + "]" + e.arAcc[i] + ":" + e.arPw[i] + ":" + e.arMoney[i]);
				}
			}
			
			System.out.println("[" + e.name + "]");
			System.out.println("[1]회원가입");
			System.out.println("[2]회원탈퇴");
			System.out.println("[3]로그인");
			System.out.println("[4]로그아웃");
			System.out.println("[5]입금하기");
			System.out.println("[6]이체하기");
			System.out.println("[7]잔액조회");
			System.out.println("[0]종료하기");
			
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			if		(sel == 1) {
				System.out.print("가입하실 id를 입력하세요 : ");
				String joinId = scan.next();
				for (int i = 0; i < e.arAcc.length; i++) {
					if(joinId.equals(e.arAcc[i])) {System.out.println("이미 존재하는 아이디입니다.");continue;}
				}
				System.out.print("가입하실 pw를 입력하세요 : ");
				String joinPw = scan.next();
								
				e.arAcc[e.accCnt] = joinId;
				e.arPw[e.accCnt] = joinPw;
				e.arMoney[e.accCnt] += 1000;
				e.accCnt++;
	
				System.out.println(joinId + "님, 회원가입되었습니다.");
			}
			else if (sel == 2) {
				if(e.identifier == -1) {System.out.println("로그인 후에 이용해주세요");}
				else {
					String[] tempA = e.arAcc;
					String[] tempP = e.arPw;
					int [] tempM = e.arMoney;
					
					e.arAcc = new String[e.accCnt - 1];
					e.arPw = new String[e.accCnt - 1];
					e.arMoney = new int[e.accCnt - 1];
					
					for (int i = 0; i < e.identifier; i++) {
						e.arAcc[i] = tempA[i];
						e.arMoney[i] = tempM[i];
						e.arPw[i] = tempP[i];
					}
					for (int i = e.identifier + 1 ; i < e.accCnt; i++) {
						e.arAcc[i] = tempA[i+1];
						e.arMoney[i] = tempM[i+1];
						e.arPw[i] = tempP[i+1];
					}
					
					e.identifier = -1;
					e.accCnt--;
					System.out.println("탈퇴가 완료되었습니다.");
				}
			}
			else if (sel == 3) {
				if(e.identifier != -1) {System.out.println("이미 로그인 되어있습니다.");continue;}
				System.out.print("로그인할 id를 입력해주세요 : ");
				String logId = scan.next();
				System.out.print("로그인할 pw를 입력해주세요 : ");
				String logPw = scan.next();
				
				for (int i = 0; i < e.accCnt; i++) {
					if(logId.equals(e.arAcc[i]) && logPw.equals(e.arPw[i])) {
						e.identifier = i;
					}
				}
				if(e.identifier == -1) {System.out.println("id와pw를 확인해주세요.");}
				else {System.out.println(e.arAcc[e.identifier] + "님, 로그인되었습니다.");}			
				
			}
			else if (sel == 4) {
				if(e.identifier == -1) {System.out.println("로그인 후에 이용해주세요.");continue;}
				System.out.println(e.arAcc[e.identifier] + "님, 로그아웃되었습니다.");
				e.identifier = -1;
			}
			else if (sel == 5) {
				if(e.identifier == -1) {System.out.println("로그인 후에 이용해주세요.");continue;}
				System.out.print("입금할 금액을 입력해주세요 : ");
				int deposit = scan.nextInt();
				e.arMoney[e.identifier] += deposit;
				System.out.println(e.arAcc[e.identifier] + "님, 입금완료되었습니다.");
				
			}
			else if (sel == 6) {
				if(e.identifier == -1) {System.out.println("로그인 후에 이용해주세요.");continue;}
				System.out.print("이체할 계좌를 입력해주세요 : ");
				String transId = scan.next();
				int transIdx = -1;
				for (int i = 0; i < e.accCnt; i++) {
					if(transId.equals(e.arAcc[i])) {transIdx = i;}
				}
				if(transIdx != -1) {
					System.out.println("이체하실 금액을 입력해주세요 : ");
					int transMoney = scan.nextInt();
					if(transMoney <= e.arMoney[e.identifier]) {
						e.arMoney[e.identifier] -= transMoney;
						e.arMoney[transIdx] += transMoney;
						System.out.println("이체가 완료되었습니다.");
					}
					else {System.out.println("이체하실 금액이 부족합니다."); continue;}
				}	
				else {System.out.println("입력하신 계좌는 존재하지않습니다.");}

			}
			else if (sel == 7) {
				if(e.identifier == -1) {System.out.println("로그인 후에 이용해주세요.");continue;}
				System.out.println(e.arAcc[e.identifier] + "님, 현재 잔액 : " + e.arMoney[e.identifier] + "원");
			}
			else if (sel == 0) {
				System.out.println("프로그램 종료");
				break;
			}
			
		}		
	scan.close();	
	}

}
