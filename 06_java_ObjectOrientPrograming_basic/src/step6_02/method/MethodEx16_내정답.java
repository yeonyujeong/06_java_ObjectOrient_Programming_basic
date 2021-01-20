// 2021.1.20	2:09 - 2:26
package step6_02.method;

import java.util.Scanner;

//# 틱택토

class TicTacToe{
	
	Scanner scan = new Scanner(System.in);
	
	String game [][] = new String [3][3];
	
	int turn = 0;
	int win = 0;
	
	void setGame() {
		
		for (int i = 0; i < game.length; i++) {
			for (int j = 0; j < game[i].length; j++) {
				game[i][j] = " ";
			}
		}
	}
	
	void showGame() {
		
		System.out.println("=== 틱택토 ===");
		for (int i = 0; i < game.length; i++) {
			for (int j = 0; j < game[i].length; j++) {
				System.out.print("[" + game[i][j] + "]");
			}
			System.out.println();
		}
		System.out.println("==============");
	}
	
	void choiceIdx() {
		
		if(turn % 2 == 0) {
			
			System.out.print("[1턴] y인덱스 선택 : ");
			int yIdx = scan.nextInt();
			
			System.out.print("[1턴] x인덱스 선택 : ");
			int xIdx = scan.nextInt();
			
			if(game[yIdx][xIdx].equals(" ")) {
				game[yIdx][xIdx] = "O";
				turn++;
			}
			else {
				System.out.println("다시 입력해주세요.");
			}
		}
		
			else if(turn % 2 == 1) {
				
				System.out.print("[2턴] y인덱스 선택 : ");
				int yIdx = scan.nextInt();
				
				System.out.print("[2턴] x인덱스 선택 : ");
				int xIdx = scan.nextInt();
				
				if(game[yIdx][xIdx].equals(" ")) {
					game[yIdx][xIdx] = "X";
					turn++;
				}
				else {
					System.out.println("다시 입력해주세요.");
				}

			}
		
	}
	
	void exitWidth() {
		for (int i = 0; i < game.length; i++) {
			if(game[i][0].equals("O") && game[i][1].equals("O") &&game[i][2].equals("O")) {win = 1;}
			if(game[i][0].equals("X") && game[i][1].equals("X") &&game[i][2].equals("x")) {win = 2;}
		}
	}
	
	void exitHeight() {
		for (int i = 0; i < game.length; i++) {
			if(game[0][i].equals("O") && game[1][i].equals("O") && game[2][i].equals("O")) {win = 1;}
			if(game[0][i].equals("X") && game[1][i].equals("X") && game[2][i].equals("X")) {win = 2;}
		}
	}
	
	void exitCross() {
			if(game[0][0].equals("O") && game[1][1].equals("O") && game[2][2].equals("O")) {win = 1;}
			if(game[0][0].equals("X") && game[1][1].equals("X") && game[2][2].equals("X")) {win = 2;}
			
			if(game[0][2].equals("O") && game[1][1].equals("O") && game[2][0].equals("O")) {win = 1;}
			if(game[0][2].equals("X") && game[1][1].equals("X") && game[2][0].equals("x")) {win = 2;}
		
	}
	
	void run() { 
		
		setGame();
		
		while(true) {
			
			showGame();
			
			if(win == 1) {
				System.out.println("turn1 승리!"); break;
			}
			else if(win == 2) {
				System.out.println("turn2 승리!"); break;
			}
			
			choiceIdx();
			exitWidth();
			exitHeight();
			exitCross();
			
			
		}
	}
	
	
	
	
	
}


public class MethodEx16_내정답 {

	public static void main(String[] args) {
		
		TicTacToe t = new TicTacToe();
		t.run();
		
		
	}

}
