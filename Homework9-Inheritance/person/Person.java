package person;

class Person {
	final static int MIN_AGE = 0;
	final static int MAX_AGE = 100;
	final String name;
	int age;
	final boolean isMale;

	Person(String name, int age, boolean isMale) {
		this.isMale = isMale;
		this.name = name;
		if (age >= MIN_AGE && age < MAX_AGE) {
			this.age = age;
		}
	}

	void showPersonInfo() {
		System.out.println("Name: " + this.name);
		System.out.println("Age: " + this.age);
		if (this.isMale) {
			System.out.println("Gender: Male");
		} else {
			System.out.println("Gender: Female");
		}
	}

}
