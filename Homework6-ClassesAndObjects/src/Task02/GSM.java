package Task02;

//Класът GSM да съдържа полетата:
//model – модел на телефона
//hasSimCard – дали в телефона е заредена SIM карта
//simMobileNumber – номер на SIM картата(телефонен номер), ако е заредена такава.
//outgoingCallsDuration – общото време (в минути) на изходящите повиквания
//lastIncomingCall – последното входящо повикване
//lastOutgoingCall – последното изходящо повикване

//Да се напишат следните методи за класа GSM:
//- insertSimCard(simMobileNumber) – метода задава номер(сим карта) на телефона. Да се 
//провери дали подаденият номер е валиден (започва с 08 и се състои от 10 цифри).
// Ако номерът е валиден, го задава на телефона и задава стойност true на полето hasSimCard
//- removeSimCard() - премахва сим картата от телефона (задава false на полето hasSimCard)
//- call( receiver, duration) – В тялото му да се направят проверки за:
//• дали въведената дължина на разговора е валидна
//• дали двата телефона (този за който се извиква метода и
//този към който се прави обаждането) не са един и същ телефон
//• дали и двата телефона имат сим карта
//Ако всички проверки преминат успешно, метода прави обаждане с продължителност duration
//към телефона, подаден като параметър. Задава това обаждане като последно изходящо повикване на
//телефона от който се прави повикването (телефона за който се извиква метода) и задава същото
// обаждане като последно входящо за телефона към който се прави обаждането.
//Осен това увеличава стойността на outgoingCallsDuration съсдължината на разговора за телефона 
//от който се прави обаждането. Да се направи и метод getSumForCall(), който връща сумата,
//начислена за изходящите повиквания на телефона (общото време на изходящите повиквания
// по цената за минута - priceForAMinute). Да се направят два метода
//printInfoForTheLastOutgoingCall() и printInfoForTheLastIncomingCall() които извеждат информация
// за последното изходящо/входящо повиквана на телефона (ако има такова)

public class GSM {

	String model;
	boolean hasSimCard;
	String simMobileNumber;
	float outgoingCallsDuration;
	float lastIncomingCall;
	float lastOutgoingCall;
	Call nextCall;

	void insertSimCard(String simMobileNumber) {
		if (this.hasSimCard == false) {
			if ((simMobileNumber.length() == 10) && simMobileNumber.charAt(0) == '0'
					&& simMobileNumber.charAt(1) == '8') {
				this.simMobileNumber = simMobileNumber;
				this.hasSimCard = true;
			} else {
				System.out.println("Please Remove the old SIM Card!");
			}
		}
	}
	void removeSimCard() {
		this.hasSimCard = false;
		this.simMobileNumber=null;
	}
	void call(GSM receiver, float duration) {
		if (duration > 0 && receiver.hasSimCard == true && this.hasSimCard == true
				&& this.simMobileNumber != receiver.simMobileNumber) {
			this.nextCall = new Call();
			this.nextCall.duration = duration;
			this.lastOutgoingCall = duration;
			this.nextCall.caller = this;
			this.nextCall.receiver = receiver;
			this.nextCall.receiver.lastIncomingCall = duration;
			this.outgoingCallsDuration += lastOutgoingCall;
			this.nextCall.priceForAMinute=2.5f;
		}else{
			System.out.println("Your call cannot be completed as dialed!");
		}
	}
	void getSumForCall() {
		if (this.outgoingCallsDuration > 0 && this.nextCall.priceForAMinute > 0) {
			System.out.println(
					"Value of all outgoing calls:" + (this.outgoingCallsDuration * this.nextCall.priceForAMinute));
		} else {
			System.out.println("Value of all outgoing calls: 0.0");
		}
	}

	void printInfoForTheLastOutgoingCall() {
		System.out.println("Last outgoing call duration: " + this.lastOutgoingCall);
	}

	void printInfoForTheLastIncomingCall() {
		System.out.println("Last incoming call duration: " + this.lastIncomingCall);
	}
}
