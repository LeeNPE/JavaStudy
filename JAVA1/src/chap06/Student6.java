package chap06;

public class Student6 {
	private String name;
	private Score score;
	Student6() {}
	Student6(String name, Score score){
		this.name = name;
		this.score = score;
	}
	String getName() {return name; }
	Score getScore() {return score; }
	void setName(String name) { this.name = name;}
	void setScore(Score score) {this.score = score;}
	void incScore(int m , int e) {
		score.incMathScore(m);
		score.incEnglishScore(e);
	}
	void printStudent6() {
		System.out.println(name + ": math : " + score.getMathScore() + ", English : " + score.getEnglishScore() );
	}
}
