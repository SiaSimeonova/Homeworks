
public class Problem04 {

	// ����� ������������� �������� ��������� �� �������� � �������� ����� - ���������� �����.
	// �� �� ������� ��������, ���� ����� �� �������� ����������� �� ����������  � �������� �����
	// ���� ���������� �� �� +90 �������.
	// ������:
	// 1,2,3,4
	// 5,6,7,8
	// 9,10,11,12
	// 13,14,15,16
	// �����
	// 13,9,5,1
	// 14,10,6,2
	// 15,11,7,3
	// 16,12,8,4

	public static void main(String[] args) {
		int[][] a = { { 1, 2, 3, 4 },
				{ 5, 6, 7, 8 }, 
				{ 9, 10, 11, 12 }, 
				{ 13, 14, 15, 16 }, };
		for (int c = 0; c < a[0].length; c++) {
			for (int r = a.length - 1; r >= 0; r--) {
				System.out.print(a[r][c] + ", ");
			}
			System.out.println();
		}
	}
}
