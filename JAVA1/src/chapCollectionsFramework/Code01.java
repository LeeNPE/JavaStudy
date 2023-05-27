package chapCollectionsFramework;

class UnchoosedType<T extends Number, V> {
	Double returnAbs(T a) {
		double d = a.doubleValue() * a.doubleValue();
		return d;
	}
	String print(V a) {
		String s = a.toString();
		return s;
	}
}

public class Code01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UnchoosedType<Integer, Integer> un= new UnchoosedType<Integer, Integer>();
		System.out.println(un.print(10));
		System.out.println(un.returnAbs(10));
	}

}
