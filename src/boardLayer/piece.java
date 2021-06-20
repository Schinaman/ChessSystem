package boardLayer;

public abstract class Piece extends Position { // aonde tá essa herença no diagrama?
	
	protected Position position;
	private Board board; // seguindo diagrama de classes a relação entre classe Board e Piece implica na criação de objeto board em Piece e piece em Board; 
	
	public Piece(Board board) { // relação do diagrama, Piece recebendo objeto board;
		this.board = board; // eu tenho uma tabuleiro para cada peça? é para definir qual tabuleiro a peça esta associada
		position = null; // quer dizer que a peça não foi colocada no tabuleiro ainda; poderia ser omitido;
	}
	
	protected Board getBoard() {
		return board;
	}
	
	public abstract boolean[][] possibleMoves();
	
	public boolean possibleMove(Position position) {
		return possibleMoves()[position.getRow()][position.getColumn()]; //rook methods; metodo concreto esta utilizando um metodo abstrato //sintaxe maluco, entender bem;  
	}
	
	public boolean isThereAnyPossibleMove() {
		boolean[][] mat = possibleMoves();
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat.length; j++) {
				if (mat[i][j]) {
					return true;
				}
			}
		}
		return false;
	}
}
