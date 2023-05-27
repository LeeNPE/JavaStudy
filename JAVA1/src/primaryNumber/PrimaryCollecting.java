package primaryNumber;

import java.util.HashSet;
import java.util.Iterator;

class PnWorker{
	HashSet<Integer> pnCollection = new HashSet<Integer>();
	
	boolean isPn(int num) {
		Iterator<Integer> it = pnCollection.iterator();
		
		while (it.hasNext()) {
			int pn = it.next();
			if(num % pn  == 0) {
				return false;
			}
		}
		return true;
	}
	
}

public class PrimaryCollecting {

	public static void main(String[] args) {
		// pn = PrimaryNumber
		System.out.println("start");
		PnWorker p = new PnWorker();		
		p.pnCollection.add(2);
		
		for (int pnCount = 3; pnCount < 300000; pnCount++) {
			if(p.isPn(pnCount)) {
				System.out.println(pnCount);
				p.pnCollection.add(pnCount);
			}
		}
//		
//		Iterator<Integer> it = pnCollection.iterator();

//		while (it.hasNext()) {
//			System.out.println("pn : " + it.next());
//		}
//
//		System.out.println("finish.");
	}

}
