package ch09;

public class LocalVariableInter {

	public static void main(String[] args) {
		
		var i = 10;
		var j = 10.0;
		var str = "test";
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(str);

		var str2 = str;
		System.out.println(str2);
		
		str = "hello";
//		str = 3;	=> 위에서 처음 String을 넣어주었기 때문에 int형은 사용할 수 없음
		
	}

}
