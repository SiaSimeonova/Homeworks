package person;

public class Student extends Person {
	final static double MIN_SCORE = 2;
	final static double MAX_SCORE = 6;
	double score;

	Student(String name, int age, boolean isMale, double score) {
		super(name, age, isMale);
		this.score = score;
	}

	public void showStudentInfo() {
		showPersonInfo();
		System.out.println("Score: " + this.score);
	}
}
