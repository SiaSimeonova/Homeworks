
public class Problem14 {
	
//	����� ������������� ������� ��������� �����, �������� ������ �����.
//	�� �� ������� ��������, ���� ����� �� ������� ���� �������� ��� ��������� �� ��������� [-2.99..2.99]
//	 � ������ ������ �� ������� �� ������.
//	������: 7.1,8.5,0.2,3.7,0.99,1.4,-3.5,-110,212,341,1.2
//	�����: 0.2; 0.99; 1.4; 1.2

	public static void main(String[] args) {
		double[] a = {7.1, 8.5, 0.2, 3.7, 0.99, 1.4, -3.5, -110, 212, 341, 1.2 };
		for (int i = 0; i < a.length; i++) {
			if (a[i] > -2.99 && a[i] < 2.99) {
				System.out.print(a[i] + "; ");
			}
		}
	}
}
