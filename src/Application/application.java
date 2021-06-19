package Application;

import boardLayer.Board;
import boardLayer.Position;
import chessLayer.ChessMatch;

public class Application {

	public static void main(String[] args) {
		testaChessMatch();
		
	}

	
	public static void testaPosition() {
		Position position = new Position();
		position.setValues(1,2);
		System.out.println(position.toString());
		System.out.println(position);
	}
	
	public static void testaBoard() {
		Board board = new Board (8,8);
	}
	
	public static void testaChessMatch() {
		ChessMatch chessMatch = new ChessMatch();
		UI.printBoard(chessMatch.getPieces());
	}
}
