package myjava;

import java.io.Reader;

public class ExceptionTest {
	public static void main(String[] args) {
		try {
			System.out.println("start");
			print(-5);
			System.out.println("next");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			//e.printStackTrace();
		}
		System.out.println("end");
	}

	private static void print(int count) throws Exception {
		// TODO Auto-generated method stub
		if(count <=0 ) {
			throw new Exception("0보다 작은 수는 안돼!");
		}
		for(int i=0; i<count; i++) {
			System.out.println("Hello!");
		}
	}

}
