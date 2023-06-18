package tictactoe;

class TicTacToe {

	char[][] board;
	
	public TicTacToe() {
		board=new char [3][3];
		initboard();
	}
	
	private void initboard(){
		
		
		for(int i=0;i<board.length;i++) {
			for(int j=0;j<board[i].length;j++) {
				board[i][j] = ' ';
			}
		}
		
	}
	
	public void displayBoard() {
		
		System.out.println("-------------");
		for(int i=0;i<board.length;i++) {
			System.out.print("| ");
			for(int j=0;j<board[i].length;j++) {
				System.out.print(board[i][j]+" | ");
			}
			System.out.println();
			System.out.println("-------------");
		}
		
	}
	public boolean placeMark(int i,int j, char M) {
		
		if(i<3 && i>=0 && j>=0 && j<3 && board[i][j]==' ') {
			board[i][j]=M;
			return true;
		}else {
			return false;
		}
	}
	
	boolean iscolWin() {
		for(int j=0;j<board.length;j++) {
			
			if(board[0][j]!=' ' && board[0][j]==board[1][j] && board[1][j]==board[2][j]) {
				return true;
			}
			
		}
		return false;
	}
	boolean isrowWin() {
		for(int j=0;j<board.length;j++) {
			
			if(board[j][0]!=' ' && board[j][0]==board[j][1] && board[j][1]==board[j][2]) {
				return true;
			}
			
		}
		return false;
	}
	boolean isdigWin() {
		if(board[0][0]!=' ' && board[0][0]==board[1][1] && board[1][1]==board[2][2]) {
			return true;
		}
		if(board[0][2]!=' ' && board[0][2]==board[1][1] && board[1][1]==board[2][0]) {
			return true;
		}
		return false;
	}
	
}
