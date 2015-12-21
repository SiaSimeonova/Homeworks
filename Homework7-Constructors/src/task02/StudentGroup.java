package task02;

public class StudentGroup {
	String groupSubject;
	Student[] students;
	int freePlaces;

	void addStudent(Student newStudent) {
		if ((newStudent.subject.equalsIgnoreCase(this.groupSubject)) && this.freePlaces > 0) {
			students[students.length - freePlaces] = newStudent;
			freePlaces--;
		}
	}

	// !!!!!!!!!!!!!!!!
	void emptyGroup() {
		this.students = new Student[5];
		this.freePlaces = 5;
	}

	void theBestStudent() {
		double bestGrades = 0;
		int index = 0;
		for (int i = 0; i < students.length-freePlaces; i++) {
			if (this.students[i].grade > bestGrades) {
				bestGrades = students[i].grade;
				index = i;
			}
			
		}
		System.out.println("The best student in group is: "+this.students[index].name);
	}

	void printStudentsInGroup() {
		for (int i = 0; i < students.length-freePlaces; i++) {
				System.out.println("Student number " + (i + 1) + ": ");
				System.out.println("Name: " + students[i].name);
				System.out.println("Age: " + students[i].age);
				System.out.println("Grade: " + students[i].grade);
				System.out.println("Year in college: " + students[i].yearInCollege);
				System.out.println("Is graduated: " + students[i].isDegree);
				System.out.println("Scolarship: " + students[i].money);
		}
	}

	StudentGroup() {
		students = new Student[5];
		freePlaces = 5;
	}

	StudentGroup(String subject) {
		this();
		if (!(subject.equals(null) && subject.equals(""))) {
			groupSubject = subject;
		}
	}
}