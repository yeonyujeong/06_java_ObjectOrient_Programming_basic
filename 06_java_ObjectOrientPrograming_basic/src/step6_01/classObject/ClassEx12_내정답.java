package step6_01.classObject;
/* 
 * # 틱택토
 * === 틱택토 ===
 * [X][X][O]
 * [ ][O][ ]
 * [ ][ ][ ]
 * [p1]인덱스 입력 : 6
 * === 틱택토 ===
 * [X][X][O]
 * [ ][O][ ]
 * [O][ ][ ]
 * [p1]승리
 * 
 */

import java.util.Scanner;

class Ex12{
	String[][] game = new String[3][3];
	
	int turn = 0;
	int win = 0;		
}

// 2021. 1. 12   12:13 - 12:33

public class ClassEx12_내정답 {
	
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	Ex12 e = new Ex12();
	
	
	while(true) {
		e.turn++;
		
		System.out.println("=== 틱택토 ===");
		for (int i = 0; i < e.game.length; i++) {
			for (int j = 0; j < e.game[i].length; j++) {
				if(e.game[i][j] == null) {System.out.print("[ ]");}
				else {System.out.print("[" + e.game[i][j] + "]");}
			}	
			System.out.println();
		}
		
		if(e.turn % 2 == 1) {
			System.out.print("[p1] y좌표 입력 : ");
			int p1Y = scan.nextInt();		
			System.out.print("[p1] x좌표 입력 : ");
			int p1X = scan.nextInt();
			
			if(p1Y < 0 || p1Y > 2 ||p1X < 0 || p1X > 2) {
				System.out.println("잘못 입력했습니다.");
				continue;
			}
			
			if(e.game[p1Y][p1X]!= null) {System.out.println("이미 차지된 자리입니다.");continue;}
			else {e.game[p1Y][p1X] = "O"; }	
		}
		
		if(e.turn % 2 == 0) {
			System.out.print("[p2] y좌표 입력 : ");
			int p2Y = scan.nextInt();		
			System.out.print("[p2] x좌표 입력 : ");
			int p2X = scan.nextInt();
			
			if(p2Y < 0 || p2Y > 2 ||p2X < 0 || p2X > 2) {
				System.out.println("잘못 입력했습니다.");
				continue;
			}
			
			if(e.game[p2Y][p2X]!= null) {System.out.println("이미 차지된 자리입니다.");continue;}
			else {e.game[p2Y][p2X] = "X"; }	
		}
		
		for (int i = 0; i < e.game.length; i++) {
			for (int j = 0; j < e.game[i].length; j++) {
				if(e.game[i][0] == "O" && e.game[i][1] == "O" && e.game[i][2] == "O") {e.win = 1;}
				else if(e.game[i][0] == "X" && e.game[i][1] == "X" && e.game[i][2] == "X") {e.win = 2;}
				
				else if(e.game[0][j] == "O" && e.game[1][j] == "O" && e.game[2][j] == "O") {e.win = 1;}
				else if(e.game[0][j] == "X" && e.game[1][j] == "X" && e.game[2][j] == "X") {e.win = 2;}
				
				else if(e.game[0][0] == "O" && e.game[1][1] == "O" && e.game[2][2] == "O") {e.win = 1;}
				else if(e.game[0][0] == "X" && e.game[1][1] == "X" && e.game[2][2] == "X") {e.win = 2;}
				
				else if(e.game[0][2] == "O" && e.game[1][1] == "O" && e.game[2][0] == "O") {e.win = 1;}
				else if(e.game[0][2] == "X" && e.game[1][1] == "X" && e.game[2][0] == "X") {e.win = 2;}
				
			}
		}
		
		if(e.win == 1) {System.out.println("p1승리!"); break;}
		else if(e.win == 2) {System.out.println("p2승리!"); break;}
		
		
		
	}
		
		scan.close();
		
		
		
	}

}
