package tile;

import tile.DotFactory.DotType;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TileBoard t = new TileBoard(10, 10, DotType.Square);
		System.out.println(t.getTile(2, 4));
		System.out.println(t.getTile(0, 0));
		Unit sword = new Unit();
		t.setTile(2, 4, sword);
		System.out.println(t.getTile(2, 4));
		Unit x = (Unit) t.getTile(2, 4);
		System.out.println(x.getName());
	}

}
