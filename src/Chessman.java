
public class Chessman {

	private String label;
	private int x;
	private int y;
	
	public Chessman(String label, int x, int y) {
		this.label = label;
		this.x = x;
		this.y = y;
	}
	
	public void setLabel(String label) {
		this.label = label;
	}
	
	public String getLabel() {
		return this.label;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getX() {
		return this.x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public int getY() {
		return this.y;
	}
	
	public ChessmanMemento save() {
		return new ChessmanMemento(this.label, this.x, this.y);
	}
	
	public void restoreMemento(ChessmanMemento chessmanMemento) {
		this.label = chessmanMemento.getLabel();
		this.x = chessmanMemento.getX();
		this.y = chessmanMemento.getY();
	}
	
}
