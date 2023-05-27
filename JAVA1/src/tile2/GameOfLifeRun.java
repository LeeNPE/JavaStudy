package tile2;

import java.util.Random;
public class GameOfLifeRun {
	int boarderX;
	int boarderY;
	TileField field1;
	TileField field2;
	
	public GameOfLifeRun(int boarderX, int boarderY) {
		// TODO Auto-generated constructor stub
		this.boarderX = boarderX;
		this.boarderY = boarderY;
		field1 = new TileField(boarderX, boarderY);
		field2 = new TileField(boarderX, boarderY);

	}
	void randomStart() {
		Random r = new Random();
		for(int i = 0 ; i < boarderX; i++) {
			for(int j = 0; j < boarderY;j++) {
				field1.getSquare(i, j).setState(r.nextBoolean());
			}
		}
	}
	void runTurn() {
		turn();
		field1.printTile();
	}
	
	private void turn() {
		for(int i = 0 ; i < boarderX; i++) {
			for(int j = 0; j < boarderY;j++) {
				Square result = field2.getSquare(i, j);
				result.setState(field1.live(i, j));
			}
		}
		Square[][] temp = field1.getField();
		field1.setField(field2.getField());
		field2.setField(temp);
	}
}
