package chessLayer;

import boardLayer.Board;

public class Rook extends ChessPiece {

	public Rook(Board board, Color color) {
		super(board, color); // board vem l� da primeira classe Position.board -> Piece.board -> ChessPiece.board, garante que todas as subclasses utilizem o mesmo objeto. 
							 // curioso que eu s� declaro o tamanho do tabuleiro em ChessMatch, se no caso da pe�a Rook(super(board)) o tabuleiro � o mesmo desde Piece, como chessMatch comunica com Board e com Piece mesmo? D� para enxergar melhor pelo diagrama, ChessMatch recebe os elementos de Chesspiece que por ventura se comunica com Piece e em seguida com Board.
	}

	@Override
	public String toString() {
		 return "R";
	}
}
