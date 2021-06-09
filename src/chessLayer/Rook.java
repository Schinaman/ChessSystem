package chessLayer;

import boardLayer.Board;

public class Rook extends ChessPiece {

	public Rook(Board board, Color color) {
		super(board, color); // board vem lá da primeira classe Position.board -> Piece.board -> ChessPiece.board, garante que todas as subclasses utilizem o mesmo objeto. 
							 // curioso que eu só declaro o tamanho do tabuleiro em ChessMatch, se no caso da peça Rook(super(board)) o tabuleiro é o mesmo desde Piece, como chessMatch comunica com Board e com Piece mesmo? Dá para enxergar melhor pelo diagrama, ChessMatch recebe os elementos de Chesspiece que por ventura se comunica com Piece e em seguida com Board.
	}

	@Override
	public String toString() {
		 return "R";
	}
}
