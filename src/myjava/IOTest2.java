package myjava;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class IOTest2 {
	public static void main(String[] args) throws Exception {
		// 이진 파일 -> 바이트, 일반텍스트 파일 -> 문자로 처리
		Reader reader = new FileReader("list.txt");
		int input = reader.read();
		System.out.println((char)input);
		while(input != -1) {
			System.out.print((char)input);
			input = reader.read();
		}
	}
}
