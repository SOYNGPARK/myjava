package myjava;

public class StringTest {
	public static void main(String[] args) {
		String str = new String("haha");
		String str2 = new String("haha");
		System.out.println(str==str2);
		System.out.println(str.equals(str2));
		// 문자열을 비교할 때는 ==이 아니라 equals 메소드를 써야한다..
		
		String str3 = "haha";
		String str4 = "haha";
		System.out.println(str3==str4);
		System.out.println(str3.equals(str4));
		
	}

}
