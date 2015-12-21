package Task02;

public class GSMDemo {

	public static void main(String[] args) {

		GSM gsm1 = new GSM();
		gsm1.insertSimCard("0877222222");
		GSM gsm2 = new GSM();
		gsm2.insertSimCard("0866665555");
		gsm1.call(gsm2, 5.0f);
		if (gsm1.nextCall!=null) {
			System.out.println("Caller:");
			System.out.println(gsm1.hasSimCard);
			System.out.println(gsm1.simMobileNumber);
			gsm1.getSumForCall();
			gsm1.printInfoForTheLastIncomingCall();
			gsm1.printInfoForTheLastOutgoingCall();
			System.out.println();
			System.out.println("Receiver: ");
			System.out.println(gsm2.hasSimCard);
			System.out.println(gsm2.simMobileNumber);
			gsm2.getSumForCall();
			gsm2.printInfoForTheLastIncomingCall();
			gsm2.printInfoForTheLastOutgoingCall();
		}
	}

}
