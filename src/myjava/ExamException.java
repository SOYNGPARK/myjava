package myjava;

import java.util.Scanner;

public class ExamException {
	public static void main(String[] args) {
		
		System.out.println("거꾸로 변환할 문자열을 입력바랍니다.");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		
		try {
			String output = Util.convert(input);
			System.out.printf("변환된 문자열은 %s입니다.", output);
			
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
			throw new ConversionException("예외가 발생되었습니다. "
					+ "문자열을 입력하지 않고 Enter키를 누르셨습니다.");
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