package chap06;

public class Code24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student5 st[] =  { new Student5("Alice", 88), new Student5("Tom", 98), new Student5("Jenny", 80), new Student5("Betty", 79), new Student5("Daniel", 91)};
		int total = 0;
		/*for (int i = 0; i < st.length; i++)
			total += st[i].getScore();*/
		for(Student5 a : st) 
			total += a.getScore();
		double average = (double) total / st.length;
		System.out.println("average : " + average);
	}

}
