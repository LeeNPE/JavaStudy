package gameOfLife;

public class Cell {
	final static boolean LIVE = true;
	final static boolean DIE = false;
	boolean isLive;
	
	void born(int neighborLive) {
		if(maintain(neighborLive, 3) == true) {
			isLive = LIVE;
		}else isLive = DIE;
	}
	
	void survive(int neighborLive) {
		if(maintain(neighborLive, 2) == true || maintain(neighborLive, 3)) {
			isLive = LIVE;
		}else isLive = DIE;
	}
//	
//	boolean canBorn(int neiborLive){
//		if(neiborLive == 3) {
//			return true;
//		}return false;
//	}
//	
//	boolean canSurvive(int neiborLive){
//		if(neiborLive == 3 || neiborLive == 2) {
//			return true;
//		}return false;
//	}
	
	boolean maintain(int neiborLive, int isMaintain) {
		if(neiborLive == isMaintain) return true;
		return false;
	}
}
