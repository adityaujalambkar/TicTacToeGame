package tictactoe;

import java.util.Scanner;

public class humanPlayer {
	String name;
	char mark ;
	boolean isWin=false;
	humanPlayer(String name,char mark){
		this.name=name;
		this.mark=mark;
	}
	
	void makeMove(TicTacToe t) {
		
		System.out.println("Please enter the position row and col");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		boolean m = t.placeMark(x,y,mark);
		if(m) {
			if(t.iscolWin() || t.isdigWin() || t.isrowWin()) {
				isWin=true;
				System.out.println("Hey, You win the game");
			}
			return;
		}else {
			makeMove(t);
		}
	}

}
