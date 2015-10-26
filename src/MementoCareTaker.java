
public class MementoCareTaker {

	private static ChessmanMemento chessmanMemnto;
	
	public static void setChessmanMemento(ChessmanMemento chessmanMemnto) {
		MementoCareTaker.chessmanMemnto = chessmanMemnto;
	}
	
	public static ChessmanMemento getChessmanMemento() {
		return MementoCareTaker.chessmanMemnto;
	}
}
