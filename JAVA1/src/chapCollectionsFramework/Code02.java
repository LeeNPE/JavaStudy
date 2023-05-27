package chapCollectionsFramework;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;
public class Code02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hs = new HashSet<String>();
		hs.add("Alice");
		hs.add("Bayaba");
		hs.add("Clay");
		hs.add("Dan");
		TreeSet<String> ts = new TreeSet<String>();
		ts.add("Bayaba");
		ts.add("Clay");;
		ts.add("Alice");
		ts.add("Dan");
		Iterator<String> hi = hs.iterator();
		System.out.println("hi: " + hi.hasNext());
		while(hi.hasNext()) {
			System.out.println(hi.next());
		}
		Iterator<String> ti = ts.iterator();
		System.out.println("ti: " + ti.hasNext());
		while(ti.hasNext()) {
			System.out.println(ti.next());
		}
	}
}
