package task1;

public class TheFactory {

	public static void main(String[] args) {
		Employee baiIvan = new Employee();
		baiIvan.setHoursLeft(8);
		baiIvan.setName("Ivan");
		Employee stefcho = new Employee();
		stefcho.setHoursLeft(8);
		stefcho.setName("Stefan");
		Task orazmeriavane = new Task();
		orazmeriavane.setName("Orazmeriavane na material");
		orazmeriavane.setWorkingHours(6);
		Task lepene = new Task();
		lepene.setName("Lepene na detaili");
		lepene.setWorkingHours(7);
		Task opakovane = new Task();
		opakovane.setName("Opakovane na gotovi producti");
		opakovane.setWorkingHours(2);
		baiIvan.showReport(lepene);
		stefcho.showReport(orazmeriavane);
		stefcho.work(opakovane);
		System.out.println("Employee's working hours left : "+stefcho.getHoursLeft());
		System.out.println("Working hours left to be completed the task: "+opakovane.getWorkingHours());
		
		
	}

}
