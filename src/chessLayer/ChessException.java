package chessLayer;
import boardLayer.BoardException;

public class ChessException extends BoardException{ //ChessException é uma exceção especifica da partida de xadrez; //também simplifica o tratamento de exceções; basta capturar ChessExpcetion que eu vou capturar também possiveis BoardException (exemplo validateSourcePositon);
	private static final long serialVersionUID = 1L;

	public ChessException(String msg) {
		super(msg);
	}
}
