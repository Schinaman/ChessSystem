package boardLayer;

public class Board {

	private int rows;
	private int cols;
	private Piece[][] pieces; // pq eu to criando um objeto matriz de peças?! É uma propriedade, cada elemento
								// da matriz é um objeto que representa qual peça esta alocada em determinada
								// posição no tabuleiro; A Matriz representa cada unidade de espaço do
								// tabuleiro, espaço em branco é uma piece = null;

	public Board(int rows, int cols) {
		
		if (rows<=0 || cols<=0) {// Programação defensiva
			throw new BoardException("Erro ao Criar tabuleiro; necessita ao menos 1 linha ou 1 coluna");
		}
		
		this.rows = rows;
		this.cols = cols;
		pieces = new Piece[rows][cols]; // pra que que serve isso?; E aonde tá isso aqui no diagrama? será que é no (1
										// pra -> *)
	}

	public int getRows() {
		return rows;
	}
	public int getCols() {
		return cols;
	}


	public Piece piece(int row, int col) {
		if (!positionExists(row,col)) { // Programacao defensiva
			throw new BoardException("Position não existe no tabuleiro");
		}
		return pieces[row][col];
	}

	public Piece piece(Position position) {
		if (!positionExists(position)) { // Programacao defensiva
			throw new BoardException("Position não existe no tabuleiro: " + position);
		}
		return pieces[position.getRow()][position.getColumn()];
	}

	public void placePiece(Piece piece, Position position) {
		if (thereIsAPiece(position)) {
			throw new BoardException("Ja existe uma peca nesta posicao: " + position);
		}
		pieces[position.getRow()][position.getColumn()] = piece;
		piece.position = position; // position como propriedade da piece
	}
	/*
	 * public Piece removePiece(Position position) { return piece; }
	 */

	private boolean positionExists(int row, int col) {
		return (row >= 0 && row <= rows && col >= 0 && col <= cols);
	}
	private boolean positionExists(Position position) {
		return (positionExists(position.getRow(),position.getColumn()));
	}

	private boolean thereIsAPiece(Position position) {
		if (!positionExists(position)) { // Programacao defensiva
			throw new BoardException("Position não existe no tabuleiro: " + position );
		}
		return (piece(position)!= null);
	}

}
