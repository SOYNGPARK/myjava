package myjava;

import java.sql.Date;

public class ConstructorTest {
	public static void main(String[] args) {
		String str = new String("13");
		str.toString();
		
		Date date = new Date(119, 2, 12); // depreciated
		
		System.out.println(date.toString()); 
		// 오버라이딩된 메소드 - 상위 클래스 Object에서 정의된 메소드
	}
}