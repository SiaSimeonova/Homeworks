package Task01;

public class Computer {
	
//	�������� ���� Computer, ����� ��������� ��������. ������ �� ��� �������� ������:

//	-year � ������� ��������, ��������� ������ �� ������������ �� ���������
//	-price � ������� �������� (�� � ������������ �� � ���� �����), ��������� ������ �� ���������
//	-isNotebook � ������ �������� � ���� ��������� � �������� ��� ��
//	-hardDiskMemory � ������� �������� �� ������� �� ��������
//	-freeMemory � ������� ��������, ��������� ������� �� ���������� �����
//	-operationSystem � �������� ���� �� ������������� ������� �� ���������
	
//	������ �� �������� �������� ������:
//		-����� changeOperationSystem(newOperationSystem), ����� ����� ���������� �� ������ operationSystem
//		 ��� ����������, �������� ���� ���������.
//		-����� useMemory(memory), ����� �������� ���������� ����� (freeMemory) ��� ����������,
//		 �������� ���� ��������. ��� ���������� �� ��������� � ��-������ �� ���������� �����,
//		������� ��������� "Not enough free memory!"
	
//		
	
	
	int year;
	float price;
	boolean isNotebook;
	int hardDiskMemory;
	int freeMemory;
	String operationSystem;
	
	void changeOperationSystem(String newOperationSystem){
		if(!(newOperationSystem.equals(null))){
			this.operationSystem = newOperationSystem;
		}
		
	}
	void useMemory(int memory){
		if(memory>0){
			if(memory>freeMemory){
				System.out.println("Not enough free memory!");
			}else{
				this.freeMemory=freeMemory-memory;
			}
		}
	}
}
