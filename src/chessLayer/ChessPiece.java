package chessLayer;
import boardLayer.Board;
import boardLayer.Piece;
import boardLayer.Position;

public abstract class ChessPiece extends Piece { //reclama que não possui construtor poque é classe filha de Piece, como tem construtor lá tem que ter aqui também.

	private Color color;
	private int moveCount;
	
	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	protected boolean isThereOpponentPiece(Position position) {
		 ChessPiece p = (ChessPiece)getBoard().piece(position);
		 return p != null && p.getColor() != color;
	}
	
	/*public void setColor(Color color) { //não quero que a cor da peça seja modificada. Retiro do código;
		this.color = color;
	}*/
	
	
	
	
}
