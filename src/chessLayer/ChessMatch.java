package chessLayer;

import boardLayer.Board;
import boardLayer.Piece;
import boardLayer.Position;

public class ChessMatch {

	private Board board;

	public ChessMatch() {
		board = new Board(8, 8);
		initialSetup();
	}

	public ChessPiece[][] getPieces() { // pra que serve esse metodo?; é uma matriz do tipo Piece, cada elemento na
										// matriz é um objeto Piece, essa função retorna o estado atual da partida.
										// alterações feitas na matriz representam o estado atual do jogo.
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getCols()];
		for (int i = 0; i < board.getRows(); i++) {
			for (int j = 0; j < board.getCols(); j++) {
				mat[i][j] = (ChessPiece) board.piece(i, j); // chamanda a função piece do board que retorna Piece,
															// fazendo um downcasting do retorno para ChessPiece;
			}
		}
		return mat;
	}

	public ChessPiece performChessMove (ChessPosition sourcePosition, ChessPosition targetPosition) { //converte linguagem usuario "ChessPiece" para "Position";
		Position source = sourcePosition.toPosition();
		Position target = targetPosition.toPosition();
		
		validateSourcePosition(source);
		Piece capturedPiece = makeMove(source, target);
		return (ChessPiece)capturedPiece; //o que que eu faço com esse retorno?!  é retorno é para, por exemplo, imprimir as peças capturadas?
		//validateTagertPosition(target);
	}
	
	private Piece makeMove (Position source, Position target) {
		Piece p = board.removePiece(source);
		Piece capturedPiece = board.removePiece(target);
		board.placePiece(p, target);
		return capturedPiece; //o que que eu faço com esse retorno?! é retorno é para, por exemplo, imprimir as peças capturadas?
	}
	
	private void validateSourcePosition(Position position) {
		if (!board.thereIsAPiece(position)) {
			throw new ChessException("Nao existe peca na posicao de origem");
		}
	}
	
	
	private void placeNewPiece(char column, int row, ChessPiece piece) {
		board.placePiece(piece, new ChessPosition(column, row).toPosition());
	}

	private void initialSetup() {
		placeNewPiece('c', 1, new Rook(board, Color.WHITE));
		placeNewPiece('c', 2, new Rook(board, Color.WHITE));
		placeNewPiece('d', 2, new Rook(board, Color.WHITE));
		placeNewPiece('e', 2, new Rook(board, Color.WHITE));
		placeNewPiece('e', 1, new Rook(board, Color.WHITE));
		placeNewPiece('d', 1, new King(board, Color.WHITE));

		placeNewPiece('c', 7, new Rook(board, Color.BLACK));
		placeNewPiece('c', 8, new Rook(board, Color.BLACK));
		placeNewPiece('d', 7, new Rook(board, Color.BLACK));
		placeNewPiece('e', 7, new Rook(board, Color.BLACK));
		placeNewPiece('e', 8, new Rook(board, Color.BLACK));
		placeNewPiece('d', 8, new King(board, Color.BLACK));
	}
}
