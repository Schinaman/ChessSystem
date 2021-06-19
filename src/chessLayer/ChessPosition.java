package chessLayer;

import boardLayer.BoardException;
import boardLayer.Position;

public class ChessPosition {

	private char column;
	private int row;

	public ChessPosition(char column, int row) {
		if (column < 'a' || column > 'h' || row < 1 || row > 8) {
			throw new ChessException("A ChessPosition não existe: " + column + "," + row);
		}
		this.column = column;
		this.row = row;
	}

	public char getColumn() {
		return column;
	}

	public void setColumn(char column) {
		this.column = column;
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	protected Position toPosition() {
		//if (column < 'a' || column > 'h' || row < 1 || row > 8) { // NAO FAZ SENTIDO ESSA PROGRAMACAO DEFENSIVA aqui?
		//	throw new ChessException("A ChessPosition não existe: " + column + "," + row);
		//}
		return new Position(8-row, column - 'a'); //output: (0;1)
	}

	protected static ChessPosition fromPosition(Position position) {// pq é static? pq eu vou usar esse metodo em todas as classes referenciando esse formato de posicao?
		//if (!positionExists(position)) { // NAO FAZ SENTIDO ESSA PROGRAMACAO DEFENSIVA aqui?
		//	throw new BoardException("Position não existe no tabuleiro: " + position );
		//}				
		return new ChessPosition((char)('a' - position.getColumn()), 8- position.getRow());
	}
	
	@Override
	public String toString() {
		return ""+ column + row;
	}
	
}
