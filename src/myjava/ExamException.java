package myjava;

import java.util.Scanner;

public class ExamException {
	public static void main(String[] args) {
		
		System.out.println("�Ųٷ� ��ȯ�� ���ڿ��� �Է¹ٶ��ϴ�.");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		
		try {
			String output = Util.convert(input);
			System.out.printf("��ȯ�� ���ڿ��� %s�Դϴ�.", output);
			
		} catch (ConversionException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
}

class Util {
	static String convert(String str) throws ConversionException {
		
		if (str.length() == 0 || str == null) {
			throw new ConversionException("���ܰ� �߻��Ǿ����ϴ�. "
					+ "���ڿ��� �Է����� �ʰ� EnterŰ�� �����̽��ϴ�.");
		}
		
//		char[] data = new char[str.length()];
//		for(int i=0; i< str.length() ; i++) {
//			data[str.length()-(i+1)] = str.charAt(i);
//		}
//		
//		String result = "";
//		result = result.copyValueOf(data);
//		return result;
		
		return new StringBuffer(str).reverse().toString();
	}
}                                                                                        

class ConversionException extends Exception{
	ConversionException(String msg) {
		super(msg);
	}
}