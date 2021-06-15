package chessLayer;
import boardLayer.Board;
import boardLayer.Position;

public class ChessMatch {

	private Board board;
	
	public ChessMatch() {
		board = new Board(8,8);
		initialSetup();
	}
	
	public ChessPiece[][] getPieces(){ //pra que serve esse metodo?; � uma matriz do tipo Piece, cada elemento na matriz � um objeto Piece, essa fun��o retorna o estado atual da partida. altera��es feitas na matriz representam o estado atual do jogo.
		ChessPiece[][] mat = new ChessPiece[board.getRows()] [board.getCols()];
		for (int i=0; i<board.getRows(); i++) {
			for (int j=0; j< board.getCols(); j++) {
				mat[i][j] = (ChessPiece) board.piece(i, j); //chamanda a fun��o piece do board que retorna Piece, fazendo um downcasting do retorno para ChessPiece;
			}
		}
		return mat;
	}
	
	private void placeNewPiece(char column, int row, ChessPiece piece) {
		board.placePiece(piece,  new ChessPosition(column, row).toPosition());
	}

	
	private void initialSetup() {
		placeNewPiece('b',6, new Rook(board, Color.WHITE));
		placeNewPiece('e',8, new King(board, Color.BLACK));
		
	}
	

}
