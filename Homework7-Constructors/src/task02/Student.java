package task02;

public class Student {
	String name;
	String subject;
	double grade;
	short yearInCollege;
	int age;
	boolean isDegree;
	double money;
	
	void upYear(){
		if(this.yearInCollege<4){
			this.yearInCollege++;
			if(this.yearInCollege==4){
				isDegree=true;
			}
		}else{
			System.out.println("The student is graduated!");
		}
	}
	double receiveScolarship(double min, double amount){
		if(grade >=min && age<30){
			this.money=money+amount;
		}
			return this.money;
	}

	Student() {
		this.grade = 4.0;
		this.yearInCollege = 1;
		this.isDegree = false;
		this.money = 0;
	}

	Student(String name, String subject, int age) {
		this();
		if (!(name.equals(null) && name.equals(""))) {
			this.name = name;
		}
		if (!(subject.equals(null) && subject.equals(""))) {
			this.subject = subject;
		}
		if (age > 0) {
			this.age = age;
		}
	}

}
