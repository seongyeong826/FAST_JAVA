package ch10;

public class TypeConversionTest {

	public static void main(String[] args) {
		
		byte bNum = 125;
		int iNum = bNum;
		
		System.out.println(iNum);
		
		int jNum = 255;
		byte cNum = (byte)jNum;		// �� ���� ���¿� �������� �ϱ� ������ ������ �߻�
		
		System.out.println(cNum);
		
		double dNum = 3.14;
		int kNum = (int)dNum;
		
		System.out.println(kNum);
		
		double num1 = 1.2;
		float num2 = 0.9F;
		
		
		int num3 = (int)num1 + (int)num2;
		int num4 = (int)(num1 + num2);
		
		System.out.println(num3);
		System.out.println(num4);
		// num3�� num4�� ������� �ٸ�

	}

}
