package boardLayer;

public class Piece extends Position {
	
	protected Position position;
	private Board board; // seguindo diagrama de classes a relação entre classe Board e Piece implica na criação de objeto board em Piece e piece em Board; 
	
	public Piece(Board board) { // relação do diagrama, Piece recebendo objeto board
		this.board = board;
		position = null;
	}
	
	protected Board getBoard() {
		return board;
	}
	
	public boolean[][] possibleMoves() {
		return possibleMoves();
	}
	
	public boolean possibleMove(Position position) {
		return true;
	}
	
	public boolean isThereAnyPossibleMove() {
		return true;
	}
}
