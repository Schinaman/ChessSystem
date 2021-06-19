package chessLayer;
import boardLayer.BoardException;

public class ChessException extends BoardException{ //ChessException � uma exce��o especifica da partida de xadrez; //tamb�m simplifica o tratamento de exce��es; basta capturar ChessExpcetion que eu vou capturar tamb�m possiveis BoardException (exemplo validateSourcePositon);
	private static final long serialVersionUID = 1L;

	public ChessException(String msg) {
		super(msg);
	}
}
