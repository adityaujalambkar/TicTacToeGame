package tictactoe;

import java.util.Random;
import java.util.Scanner;

public class compPlayer {

	String name;
	char mark ;
	boolean isWin=false;
	compPlayer(String name,char mark){
		this.name=name;
		this.mark=mark;
	}
	
	void makeMove(TicTacToe t) {
		
		Random r = new Random();
		int x = r.nextInt(3);
		int y = r.nextInt(3);
		boolean m = t.placeMark(x,y,mark);
		if(m) {
			if(t.iscolWin() || t.isdigWin() || t.isrowWin()) {
				isWin=true;
				System.out.println("Hey, You loose the game");
			}
			return;
		}else {
			makeMove(t);
		}
	}
	
	
	
	

}
