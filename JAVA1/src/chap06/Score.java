package chap06;

public class Score {
	private int mathScore;
	private int englishScore;
	Score(){};
	Score(int math, int english){
		mathScore = math;
		englishScore = english;
	}
	int getMathScore() {return mathScore; }
	int getEnglishScore() {return englishScore; }
	void setMathScore(int math) { mathScore = math;}
	void setEnglishScore(int english) { englishScore = english;}
	void incMathScore(int math) { mathScore += math;}
	void incEnglishScore(int english) { englishScore += english;}
}
