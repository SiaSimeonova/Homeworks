package Task02;

//������ GSM �� ������� ��������:
//model � ����� �� ��������
//hasSimCard � ���� � �������� � �������� SIM �����
//simMobileNumber � ����� �� SIM �������(��������� �����), ��� � �������� ������.
//outgoingCallsDuration � ������ ����� (� ������) �� ���������� ����������
//lastIncomingCall � ���������� ������� ���������
//lastOutgoingCall � ���������� �������� ���������

//�� �� ������� �������� ������ �� ����� GSM:
//- insertSimCard(simMobileNumber) � ������ ������ �����(��� �����) �� ��������. �� �� 
//������� ���� ���������� ����� � ������� (������� � 08 � �� ������ �� 10 �����).
// ��� ������� � �������, �� ������ �� �������� � ������ �������� true �� ������ hasSimCard
//- removeSimCard() - �������� ��� ������� �� �������� (������ false �� ������ hasSimCard)
//- call( receiver, duration) � � ������ �� �� �� �������� �������� ��:
//� ���� ���������� ������� �� ��������� � �������
//� ���� ����� �������� (���� �� ����� �� ������� ������ �
//���� ��� ����� �� ����� ����������) �� �� ���� � ��� �������
//� ���� � ����� �������� ���� ��� �����
//��� ������ �������� �������� �������, ������ ����� �������� � ��������������� duration
//��� ��������, ������� ���� ���������. ������ ���� �������� ���� �������� �������� ��������� ��
//�������� �� ����� �� ����� ����������� (�������� �� ����� �� ������� ������) � ������ ������
// �������� ���� �������� ������� �� �������� ��� ����� �� ����� ����������.
//���� ���� ��������� ���������� �� outgoingCallsDuration ������������ �� ��������� �� �������� 
//�� ����� �� ����� ����������. �� �� ������� � ����� getSumForCall(), ����� ����� ������,
//��������� �� ���������� ���������� �� �������� (������ ����� �� ���������� ����������
// �� ������ �� ������ - priceForAMinute). �� �� �������� ��� ������
//printInfoForTheLastOutgoingCall() � printInfoForTheLastIncomingCall() ����� �������� ����������
// �� ���������� ��������/������� ��������� �� �������� (��� ��� ������)

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
