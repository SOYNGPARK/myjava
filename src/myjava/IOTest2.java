package myjava;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class IOTest2 {
	public static void main(String[] args) throws Exception {
		// ���� ���� -> ����Ʈ, �Ϲ��ؽ�Ʈ ���� -> ���ڷ� ó��
		Reader reader = new FileReader("list.txt");
		int input = reader.read();
		System.out.println((char)input);
		while(input != -1) {
			System.out.print((char)input);
			input = reader.read();
		}
	}
}
