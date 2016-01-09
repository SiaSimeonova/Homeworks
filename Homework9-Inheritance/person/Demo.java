package person;

public class Demo {

	public static void main(String[] args) {
		Person [] persons = new Person[10];
		Person mimi = new Person("Mimi", 19, false);
		Person milen = new Person("Milen", 23, true);
		Student katerina = new Student("Katerina", 22, false, 33);
		Student kalin = new Student("Kalin", 24, true, 120);
		Employee ralitsa = new Employee("Ralitsa", 29, false, 200);
		Employee rosen = new Employee("Rosen", 30, true, 200);
		persons[0] = mimi;
		persons[1] = milen;
		persons[2] = katerina;
		persons[3] = kalin;
		persons[4] = ralitsa;
		persons[5] = rosen;
		for (int i = 0; i < persons.length; i++) {
			if (persons[i] != null) {
				String getclass = persons[i].getClass().toString();
				if(getclass.equals("class person.Person")){
					persons[i].showPersonInfo();
					System.out.println();
				}
				if(getclass.equals("class person.Student")){
					((Student)persons[i]).showStudentInfo();
					System.out.println();
				}
				if(getclass.equals("class person.Employee")){
					((Employee)persons[i]).showEmployeeInfo();
					System.out.println();
				}
			}
		}
		for (int i = 0; i < persons.length; i++) {
			if (persons[i] != null) {
				String getclass = persons[i].getClass().toString();
				if(getclass.equals("class person.Employee")){
					double overtimeMoney=((Employee)persons[i]).calculateOvertime(2);
					System.out.println(persons[i].name+" has: "+overtimeMoney+" lv. for working overtime.");
				}
			}
		}
	}
}
