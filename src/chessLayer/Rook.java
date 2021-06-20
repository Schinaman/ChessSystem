package chessLayer;

import boardLayer.Board;
import boardLayer.Position;

public class Rook extends ChessPiece {

	public Rook(Board board, Color color) {
		super(board, color); // board vem lá da primeira classe Position.board -> Piece.board ->
								// ChessPiece.board, garante que todas as subclasses utilizem o mesmo objeto.
								// curioso que eu só declaro o tamanho do tabuleiro em ChessMatch, se no caso da
								// peça Rook(super(board)) o tabuleiro é o mesmo desde Piece, como chessMatch
								// comunica com Board e com Piece mesmo? Dá para enxergar melhor pelo diagrama,
								// ChessMatch recebe os elementos de Chesspiece que por ventura se comunica com
								// Piece e em seguida com Board.
	}

	@Override
	public String toString() {
		return "R";
	}

	@Override
	public boolean[][] possibleMoves() {
		boolean[][] mat =new boolean [getBoard().getRows()][getBoard().getCols()];
		
		Position p = new Position(0,0);
		
		//acima
		p.setValues(position.getRow()-1, position.getColumn()); //objeto "p" que estava vazio, está agora recebendo os atributos de posição generica herdada lá de "Piece"; então é o position de Piece que também é o position do proprio Rook
		while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
			p.setRow(p.getRow() -1);
		}
		if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}
		
		//baixo
		p.setValues(position.getRow()+1, position.getColumn());
		while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
			p.setRow(p.getRow()+1);
		}
		if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}
		
		//esquerda
		p.setValues(position.getRow(), position.getColumn()-1); //objeto "p" que estava vazio, está agora recebendo os atributos de posição generica herdada lá de "Piece"; então é o position de Piece que é o position do proprio "Rook"
		while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
			p.setColumn(p.getColumn() -1);
		}
		if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}
		
		//direita
		p.setValues(position.getRow(), position.getColumn()+1);
		while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
			p.setColumn(p.getColumn()+1);
		}
		if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}	

		
		return mat;
	}
}
