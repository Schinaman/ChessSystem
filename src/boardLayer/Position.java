package boardLayer;

public class Position {
	private int column;
	private int row;
	

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

	public void Position(int row, int column) {
		this.row = row;
		this.column = column;	
	}
	
	
	public void setValues(int row, int column) {
		this.row = row;
		this.column = column;
	}
	
	@Override
	public String toString() {
		 return row + "," + column;
	}
	
	
	
}

	
	



