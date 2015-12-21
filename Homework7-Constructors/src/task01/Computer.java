package task01;

public class Computer {

	int year;
	double price;
	boolean isNotebook;
	double hardDiskMemory;
	double freeMemory;
	String operationSystem;

	void changeOperationSystem(String newOperationSystem) {
		if (!(newOperationSystem.equals(null))) {
			this.operationSystem = newOperationSystem;
		}

	}

	void useMemory(int memory) {
		if (memory > 0) {
			if (memory > freeMemory) {
				System.out.println("Not enough free memory!");
			} else {
				this.freeMemory = freeMemory - memory;
			}
		}
	}

	public int comparePrice(Computer c) {
		if (this.price > c.price) {
			return -1;
		} else {
			if (this.price < c.price) {
				return 1;
			} else {
				return 0;
			}
		}
	}

	Computer() {
		this.isNotebook = false;
		this.operationSystem = "Win XP";
	}

	public Computer(int year, double price, double hardDiskMemory, double freeMemory) {
		this();
		if (year > 0) {
			this.year = year;
		}
		if (price > 0) {
			this.price = price;
		}
		if (hardDiskMemory > 0) {
			this.hardDiskMemory = hardDiskMemory;
		}
		if (freeMemory > 0) {
			this.freeMemory = freeMemory;
		}
	}

	public Computer(int year, double price, boolean isNotebook, double hardDiskMemory, double freeMemory,
			String operationSystem) {
		if (year > 0) {
			this.year = year;
		}
		if (price > 0) {
			this.price = price;
		}
		if (hardDiskMemory > 0) {
			this.hardDiskMemory = hardDiskMemory;
		}
		if (freeMemory > 0) {
			this.freeMemory = freeMemory;
		}
		if (!((operationSystem.equals(null)) && (operationSystem.equals("")))) {
			this.operationSystem = operationSystem;
		}
		this.isNotebook = isNotebook;
	}
}
