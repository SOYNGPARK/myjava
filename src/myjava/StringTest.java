package myjava;

public class StringTest {
	public static void main(String[] args) {
		String str = new String("haha");
		String str2 = new String("haha");
		System.out.println(str==str2);
		System.out.println(str.equals(str2));
		// ���ڿ��� ���� ���� ==�� �ƴ϶� equals �޼ҵ带 ����Ѵ�..
		
		String str3 = "haha";
		String str4 = "haha";
		System.out.println(str3==str4);
		System.out.println(str3.equals(str4));
		
	}

}
