package task02;

public class College {

	public static void main(String[] args) {
		Student vasko = new Student();
		Student emo = new Student("Emo","Politology", 20);
		vasko.name = "Vasko";
		vasko.age = 20;
		vasko.subject="Politology";
		vasko.grade = 20;
		emo.grade = 22;
		emo.receiveScolarship(15, 200);
		emo.upYear();
		vasko.upYear();
		Student evlogi = new Student("Evlogi","Politology", 19);
		Student maria = new Student("Maria", "Chemistry", 18);
		Student elena = new Student("Elena", "Chemistry", 19);
		StudentGroup politology = new StudentGroup("Politology");
		StudentGroup chemistry = new StudentGroup("Chemistry");
		politology.addStudent(evlogi);
		politology.addStudent(emo);
		politology.addStudent(vasko);
		chemistry.addStudent(maria);
		chemistry.addStudent(elena);
		System.out.println(politology.groupSubject);
		politology.printStudentsInGroup();
		politology.theBestStudent();
		System.out.println(chemistry.groupSubject);
		chemistry.printStudentsInGroup();
		chemistry.theBestStudent();
	
	}
}
