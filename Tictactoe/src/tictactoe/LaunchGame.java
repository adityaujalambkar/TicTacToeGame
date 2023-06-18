package tictactoe;

import java.util.Scanner;

public class LaunchGame {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		TicTacToe t = new TicTacToe();
		t.displayBoard();
		System.out.println("Enter your name");
		String Pname = sc.next();
		humanPlayer h1 = new humanPlayer(Pname,'X');
		System.out.println("choose 1 to Play with computer or any other key to play with another player");
		int v = sc.nextInt();
		if(v!=1) {
			System.out.println("Enter the second player name");
			String Sname = sc.next();
			humanPlayer h2 = new humanPlayer(Sname,'O');
			 while(h1.isWin==false && h2.isWin==false) {
					
					h1.makeMove(t);
					t.displayBoard();
					if(h1.isWin==false) {
					h2.makeMove(t);
					t.displayBoard();
					}
					
				}
		}else {
			compPlayer h2 = new compPlayer("TicTacToeBOT",'C');
			while(h1.isWin==false && h2.isWin==false) {
				
				h1.makeMove(t);
				t.displayBoard();
				if(h1.isWin==false) {
				h2.makeMove(t);
				t.displayBoard();
				}
				
			}
		}
		
		
		
	}

}
