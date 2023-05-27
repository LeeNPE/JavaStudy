package grid;
import java.util.HashMap;
public class Grid {
	HashMap<int[],Located> grid = new HashMap<int[],Located>();

	Grid(int xLocation, int yLocation){
		int[] location;
		for(int y = 1; y <= yLocation ; y++) {
			for(int x = 1; x <= xLocation ; x++) {
				location[0] = x;
				location[1] = y;
				grid.put(location, );
			}
		}
	}
	
}
