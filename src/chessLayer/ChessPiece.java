package chessLayer;
import boardLayer.Board;
import boardLayer.Piece;

public abstract class ChessPiece extends Piece { //reclama que n�o possui construtor poque � classe filha de Piece, como tem construtor l� tem que ter aqui tamb�m.

	private Color color;
	private int moveCount;
	
	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	/*public void setColor(Color color) { //n�o quero que a cor da pe�a seja modificada. Retiro do c�digo;
		this.color = color;
	}*/
	
	
	
	
}
