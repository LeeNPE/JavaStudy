package chapCollectionsFramework;
import java.util.*;
public class code05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Character> st = new Stack<Character>();
		st.push('a');
		st.push('b');
		st.push('c');
		Iterator<Character> sti = st.iterator();
		while(sti.hasNext()) {
			System.out.println(sti.next());
		}
		while(!st.isEmpty()) {
			System.out.println(st.pop());
		}
	}

}
