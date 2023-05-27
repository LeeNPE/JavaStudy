package tile;

public class TileBoard {
	private Dot[][] tileBoard; // tileBoard[x][y]

	TileBoard(int height, int width, DotFactory.DotType type) {
		DotFactory factory = new DotFactory();
		tileBoard = new Dot[width][height];
		for(int y = 0; y <= (height-1) ; y++) {
			for(int x = 0; x <= (width-1) ; x++) {
				this.setTile(x, y, factory.create(type));
			}
		}
	}
	
	Dot getTile(int x, int y) {
		return tileBoard[x][y];
	}
	
	void setTile(int x, int y, Dot value) {
		tileBoard[x][y] = value;
	}
	
	int searchTileX(Dot dot) {
		return dot.getX();
	}
	
	int searchTileY(Dot dot) {
		return dot.getY();
	}
	
}
	