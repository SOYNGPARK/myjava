package myjava;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class IOTest {
	public static void main(String[] args) throws Exception {
		Reader reader = new FileReader("list.txt");
		BufferedReader br = new BufferedReader(reader);
		String str = br.readLine();
		System.out.println(str);
	}
}
