package myjava;

public class ExceptionTest2 {
	public static void main(String[] args) {
		try { // method가 throws절로 정의되서 그냥 호출X, 반드시 예외 처리해야함
			a();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(e.getMessage());
			
		}
	}

	private static void a() throws myException {  // a() 호출한 곳에 알려줄 때 throws 하고 아니면 try catch하기
		// TODO Auto-generated method stub
		int ran = (int) (Math.random()*100);
		if(ran%2==0) throw new myException("ODD"); // 생성자 호출 -> 객체 생성
		System.out.println(ran);
	}

}

class myException extends Exception {
	myException(String msg) {
		super(msg);
	}
}
