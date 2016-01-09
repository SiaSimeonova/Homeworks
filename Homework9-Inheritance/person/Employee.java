package person;

public class Employee extends Person {
	double daySalary;
	static final double DAY_WORKING_HOURS = 8;
	static final double OVERTIME_COEFFICIENT = 1.5;

	Employee(String name, int age, boolean isMale, double salary) {
		super(name, age, isMale);
		this.daySalary = salary;
	}

	double calculateOvertime(double hours) {
		if (this.age >= 18) {
			double overtimeMoney = ((daySalary / DAY_WORKING_HOURS) * OVERTIME_COEFFICIENT);
			return overtimeMoney;
		}else{
			return 0;
		}
		
	}

	public void showEmployeeInfo() {
		showPersonInfo();
		System.out.println("Day salary: " + this.daySalary);

	}
}
