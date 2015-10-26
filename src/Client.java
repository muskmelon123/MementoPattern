
public class Client {

	public static void main(String args[]) {
		MementoCareTaker mementoCareTaker = new MementoCareTaker();
		Chessman chessman = new Chessman("车",2,2);

		mementoCareTaker.setChessmanMemento(chessman.save());
		System.out.print("" + chessman.getLabel() + " " + chessman.getX() + " " + chessman.getY() + "\n");
		
		chessman.setX(7);
		mementoCareTaker.setChessmanMemento(chessman.save());
		System.out.print("" + chessman.getLabel() + " " + chessman.getX() + " " + chessman.getY() + "\n");
		
		chessman.setY(5);
		System.out.print("" + chessman.getLabel() + " " + chessman.getX() + " " + chessman.getY() + "\n");
		
		System.out.print("悔棋\n");
		chessman.restoreMemento(mementoCareTaker.getChessmanMemento());
		System.out.print("" + chessman.getLabel() + " " + chessman.getX() + " " + chessman.getY() + "\n");
	}
}

//注意：备忘录模式就是做一个类记录主类的状态。
