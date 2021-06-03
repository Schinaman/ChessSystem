package boardLayer;

public class Board {

	private int rows;
	private int cols;
	private Piece[][] pieces; //pq eu to criando um objeto matriz de peças?!
		
	public Board(int rows, int cols) {
		this.rows = rows;
		this.cols = cols;
		pieces = new Piece[rows][cols];
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

	/*
	 public Piece removePiece(Position position) {
		return piece;
	}
	
	private boolean positionExists(Position position) {
		return (position.getRow() != 0) and (position.getColumn() != 0));  
	}*/
}
