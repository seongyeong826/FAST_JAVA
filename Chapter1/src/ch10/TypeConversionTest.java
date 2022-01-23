package ch10;

public class TypeConversionTest {

	public static void main(String[] args) {
		
		byte bNum = 125;
		int iNum = bNum;
		
		System.out.println(iNum);
		
		int jNum = 255;
		byte cNum = (byte)jNum;		// 더 작은 형태에 넣으려고 하기 때문에 문제가 발생
		
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
		// num3과 num4의 결과값이 다름

	}

}
