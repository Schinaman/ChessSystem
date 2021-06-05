package chessLayer;
import boardLayer.Board;

public class ChessMatch {

	private Board board;
	
	public ChessMatch() {
		board = new Board(8,8);
		
	}
	
	public ChessPiece[][] getPieces(){ //pra que serve esse metodo?; vai retornar um tipo Matriz de PeçaDeXadrez; o que é cada posição na Matriz? Cada posição na matriz é um objeto ChessPiece(?achoqsim)
		ChessPiece[][] mat = new ChessPiece[board.getRows()] [board.getCols()];
		for (int i=0; i<board.getRows(); i++) {
			for (int j=0; j< board.getCols(); j++) {
				mat[i][i] = (ChessPiece) board.piece(i, j); //chamanda a função piece do board que retorna Piece, fazendo um downcasting do retorno para ChessPiece;
			}
		}
		return mat;
	}
	
}
