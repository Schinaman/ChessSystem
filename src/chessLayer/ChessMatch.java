package chessLayer;
import boardLayer.Board;

public class ChessMatch {

	private Board board;
	
	public ChessMatch() {
		board = new Board(8,8);
		
	}
	
	public ChessPiece[][] getPieces(){ //pra que serve esse metodo?; vai retornar um tipo Matriz de Pe�aDeXadrez; o que � cada posi��o na Matriz? Cada posi��o na matriz � um objeto ChessPiece(?achoqsim)
		ChessPiece[][] mat = new ChessPiece[board.getRows()] [board.getCols()];
		for (int i=0; i<board.getRows(); i++) {
			for (int j=0; j< board.getCols(); j++) {
				mat[i][i] = (ChessPiece) board.piece(i, j); //chamanda a fun��o piece do board que retorna Piece, fazendo um downcasting do retorno para ChessPiece;
			}
		}
		return mat;
	}
	
}
