package Task01;
public class ComputerDemo {

//	Да се създадат 2 обекта от тип Computer. Да се зададат стойности на всеки от компютрите за year, price,
//	hardDiskMemory, freeMemory, operationSystem.Нека единият компютър да е лаптоп.	
//	 На единия от двата компютъра да се задели памет 100 (чрез метода useMemory), а на другия, да се смени
//	операционната система (чрез метода changeOperationSystem), след което да се	
//	изведат на екрана всичките полета на двата компютъра.
	
	public static void main(String[] args) {
		Computer comp1 = new Computer();
		comp1.freeMemory = 140;
		comp1.hardDiskMemory = 200;
		comp1.isNotebook = true;
		comp1.operationSystem = "Linux";
		comp1.price = 230.99f;
		comp1.year = 2014;
		
		Computer comp2 = new Computer();
		comp2.freeMemory = 440;
		comp2.hardDiskMemory = 650;
		comp2.isNotebook = false;
		comp2.operationSystem = "Linux";
		comp2.price = 260.99f;
		comp2.year = 2010;
		
		comp1.useMemory(100);
		comp2.changeOperationSystem("Windows");
		System.out.println("Computer1: ");
		System.out.println("Free memory: "+comp1.freeMemory);
		System.out.println("Hard Disk Memory: "+comp1.hardDiskMemory);
		System.out.println("Is Notebook: "+comp1.isNotebook);
		System.out.println("Operation System: "+comp1.operationSystem);
		System.out.println("Price: "+comp1.price);
		System.out.println("Manufactured: "+comp1.year);
		System.out.println();
		System.out.println("Computer2: ");
		System.out.println("Free memory: "+comp2.freeMemory);
		System.out.println("Hard Disk Memory: "+comp2.hardDiskMemory);
		System.out.println("Is Notebook: "+comp2.isNotebook);
		System.out.println("Operation System: "+comp2.operationSystem);
		System.out.println("Price: "+comp2.price);
		System.out.println("Manufactured: "+comp2.year);
	}

}
