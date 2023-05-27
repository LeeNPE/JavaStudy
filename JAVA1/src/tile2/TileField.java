package tile2;
public class TileField {
	private Square[][] tileField; // tileBoard[x][y]

	/**
	 * 
	 * @param x 크기
	 * @param y 크기
	 */
	public TileField(int x, int y) { 
		tileField = new Square[x][y];
		for (int i = 0; i < x; i++) {
			for(int j = 0; j < y; j++) {
				tileField[i][j] = new Square(Square.DIE);
			}
		}
	}

	Square[][] getField(){return tileField;}
	void setField(Square[][] field){this.tileField = field;}

	Square[] getFieldX(int y) {return tileField[y];}
	Square getSquare(int x, int y) {
		return tileField[x][y];
	}
	
	/**
	 * 나를 제외한 살아있는(state == LIVE) 주변 1칸의 객체의 수 반환  
	 * @param x 좌표 
	 * @param y 좌표 
	 * @return 살아있는 객체의 수 
	 */
	
	boolean live(int x, int y) {
		Square square = tileField[x][y];
		if(square.getState()) {
			return survive(x, y);
		}
		return born(x, y);
	}
	
	int getSurrondCount(int x, int y) {
		int count = 0;
		for (int i = -1; i <= 1; i++) {
			for (int j = -1; j <= 1; j ++) {
				try {
					Square squre = tileField[x + i][y + j];
					if (squre.getState() && (i != 0 || j != 0)) {
						count++;
					}
				} 
				catch (ArrayIndexOutOfBoundsException e) {
					// 경계를 벗어나는 경우는 카운트 하지 않으므로 아무것 도 하지 않는다.
				}
				catch (Exception e) {
					e.printStackTrace();
				}
				
			}
		}
		
		return count;		
	}
	
	boolean born(int x, int y) {
		if(getSurrondCount(x, y) == 3)
			return Square.LIVE;
		return Square.DIE;
	}
	
	boolean survive(int x, int y) {
		if(getSurrondCount(x, y) == 3 || getSurrondCount(x, y) == 2)
			return Square.LIVE;
		return Square.DIE;
	}
	
	void printTile() {
		System.out.println("########### Print World Start !! ###############");
		for(int i = 0 ; i < tileField.length ; i++) {
			for(int j = 0 ; j < tileField[i].length; j++) {
				System.out.print(tileField[i][j].consolePresent() + " ");
			}
			System.out.println();
		}
		System.out.println("########### Print World End !! ###############");
	}
	
}


class Square {
	final static boolean LIVE = true;
	final static boolean DIE = false;
	private boolean state;

	Square(boolean state){
		this.state = state;
	}
	/**
	 * return state
	 */
	public String toString() {
		String info = "" + state;
		return info;
	}
	public boolean getState() {
		return state;
	}
	
	public void setState(boolean state) {
		this.state = state;
	}
	/**
	 * state가 Live면 *
	 * DIE이면 - 반환
	 * @return 
	 */
	public char consolePresent(){
		if(state)return '■';
		return '□';
	}
	
}
