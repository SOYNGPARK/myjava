package myjava;

import java.sql.Date;

public class ConstructorTest {
	public static void main(String[] args) {
		String str = new String("13");
		str.toString();
		
		Date date = new Date(119, 2, 12); // depreciated
		
		System.out.println(date.toString()); 
		// �������̵��� �޼ҵ� - ���� Ŭ���� Object���� ���ǵ� �޼ҵ�
	}
}