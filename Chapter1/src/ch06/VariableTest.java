package ch06;

public class VariableTest {

	public static void main(String[] args) {
		
//		byte bnum = -128;
//		byte bnum = 128;			=> 오류 발생
		byte bnum = 127;
		
		System.out.println(bnum);
		
		
//		int num = 12345678900;		=> 오류 발생
//		long lNum = 12345678900;	=> 오류 발생
		long lNum = 12345678900L;
		
		System.out.println(lNum);

	}

}
