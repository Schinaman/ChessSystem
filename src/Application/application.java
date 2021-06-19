package Application;

import java.util.Scanner;

import boardLayer.Board;
import boardLayer.Position;
import chessLayer.ChessMatch;
import chessLayer.ChessPiece;
import chessLayer.ChessPosition;

public class Application {

	public static void main(String[] args) {
		
		testaMovimentacaoPecas();f
	}

	
	//Teste #3	
	public static void testaMovimentacaoPecas(){
		
		Scanner sc = new Scanner(System.in);
		ChessMatch chessMatch = new ChessMatch();
		
		while (true) {
			UI.printBoard(chessMatch.getPieces());
			System.out.println();
			System.out.println("Source: ");
			ChessPosition source = UI.readChessPosition(sc);
			
			System.out.println();
			System.out.println("Target ");
			ChessPosition target = UI.readChessPosition(sc);
			
			ChessPiece capturedPiece = chessMatch.performChessMove(source, target);
			System.out.println(capturedPiece);
			
		 }
	}
	
	
	//Teste #3
	public static void testaChessMatch() {
		ChessMatch chessMatch = new ChessMatch();
		UI.printBoard(chessMatch.getPieces());
	}
	
	//Teste #2	
	public static void testaBoard() {
		Board board = new Board (8,8);
	}
	
	//Teste #1 
	public static void testaPosition() {
		Position position = new Position();
		position.setValues(1,2);
		System.out.println(position.toString());
		System.out.println(position);
	}
	


}
