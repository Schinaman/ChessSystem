package boardLayer;

public class Piece extends Position { // aonde t� essa heren�a no diagrama?
	
	protected Position position;
	private Board board; // seguindo diagrama de classes a rela��o entre classe Board e Piece implica na cria��o de objeto board em Piece e piece em Board; 
	
	public Piece(Board board) { // rela��o do diagrama, Piece recebendo objeto board;
		this.board = board; // eu tenho uma tabuleiro para cada pe�a? � para definir qual tabuleiro a pe�a esta associada
		position = null; // quer dizer que a pe�a n�o foi colocada no tabuleiro ainda; poderia ser omitido;
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
