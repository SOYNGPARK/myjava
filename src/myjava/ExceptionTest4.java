package myjava;

public class ExceptionTest4 {
	public static void main(String[] args) {
		//Class.forName("myjava.ExceptionTest4");
		// 오류 나는 이유 : forName 이라는 메소드가 thorws절로 정의 되어 있기 때문에 이 메소드를 쓸 때 예외처리를 분명히 해야한다.
	
		try {
			Class myClass = Class.forName("myjava.ExceptionTest4");
			System.out.println("class name = "+myClass.getName());
			Class myClass2 = Class.forName("xxx");
			System.out.println("class name = "+myClass2.getName());
			//문자열로 전달받은 클래스를 메모리로 로딩하는 메소드
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.err.println(e.getMessage());
			System.out.println("그런 클래스는 없다");
		}
	}

}
