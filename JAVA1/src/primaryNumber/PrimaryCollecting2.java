package primaryNumber;

import java.util.TreeSet;
import java.util.Iterator;

class PnWorker2{
	TreeSet<Integer> pnCollection = new TreeSet<Integer>();
	boolean isPn(int num) {
		Iterator<Integer> it = pnCollection.iterator();
		while (it.hasNext())
		 //for(int i = 1;i<=Math.ceil(Math.sqrt(num)) ;i++)
		 {
			int pn = it.next();
			if(num % pn  == 0) {
				return false;
			}
		}
		return true;
	}
	
}

public class PrimaryCollecting2 {

	public static void main(String[] args) {
		// pn = PrimaryNumber
		System.out.println("start");
		PnWorker2 p = new PnWorker2();
		p.pnCollection.add(2);
		for (int pnCount = 3; pnCount < 20; pnCount++) {
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
