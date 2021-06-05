package boardLayer;

public class Board {

	private int rows;
	private int cols;
	private Piece[][] pieces; //pq eu to criando um objeto matriz de peças?!
		
	public Board(int rows, int cols) {
		this.rows = rows;
		this.cols = cols;
		pieces = new Piece[rows][cols]; // pra que que serve isso?; E aonde tá isso aqui no diagrama? será que é no (1 pra -> *)
	}
	
	 
	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getCols() {
		return cols;
	}

	public void setCols(int cols) {
		this.cols = cols;
	}

	
	
	public Piece piece(int row,int col) {
		return pieces[row][col];
	}
	
	public Piece piece(Position position) {
		return pieces[position.getRow()][position.getColumn()];
	}
	/*
	 public Piece removePiece(Position position) {
		return piece;
	}
	
	private boolean positionExists(Position position) {
		return (position.getRow() != 0) and (position.getColumn() != 0));  
	}*/
}
