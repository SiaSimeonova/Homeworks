package task01;
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
		
		Computer myNewComp1 = new Computer (2000, 2000, 600, 350);
		System.out.println("My New Computer1: ");
		System.out.println("Free memory: "+myNewComp1.freeMemory);
		System.out.println("Hard Disk Memory: "+myNewComp1.hardDiskMemory);
		System.out.println("Is Notebook: "+myNewComp1.isNotebook);
		System.out.println("Operation System: "+myNewComp1.operationSystem);
		System.out.println("Price: "+myNewComp1.price);
		System.out.println("Manufactured: "+myNewComp1.year);
		Computer myNewComp2 = new Computer (2014,1500,true,800,750,"Win 8");
		System.out.println("My New Computer2: ");
		System.out.println("Free memory: "+myNewComp2.freeMemory);
		System.out.println("Hard Disk Memory: "+myNewComp2.hardDiskMemory);
		System.out.println("Is Notebook: "+myNewComp2.isNotebook);
		System.out.println("Operation System: "+myNewComp2.operationSystem);
		System.out.println("Price: "+myNewComp2.price);
		System.out.println("Manufactured: "+myNewComp2.year);
		Computer myNewComp3 = new Computer();
		System.out.println("My New Computer3: ");
		System.out.println("Free memory: "+myNewComp3.freeMemory);
		System.out.println("Hard Disk Memory: "+myNewComp3.hardDiskMemory);
		System.out.println("Is Notebook: "+myNewComp3.isNotebook);
		System.out.println("Operation System: "+myNewComp3.operationSystem);
		System.out.println("Price: "+myNewComp3.price);
		System.out.println("Manufactured: "+myNewComp3.year);
		System.out.println(myNewComp1.comparePrice(myNewComp3));
		System.out.println(myNewComp1.comparePrice(myNewComp2));
		System.out.println(myNewComp2.comparePrice(myNewComp1));
	}

}
