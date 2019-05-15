package myjava;

public class ExceptionTest2 {
	public static void main(String[] args) {
		try { // method�� throws���� ���ǵǼ� �׳� ȣ��X, �ݵ�� ���� ó���ؾ���
			a();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(e.getMessage());
			
		}
	}

	private static void a() throws myException {  // a() ȣ���� ���� �˷��� �� throws �ϰ� �ƴϸ� try catch�ϱ�
		// TODO Auto-generated method stub
		int ran = (int) (Math.random()*100);
		if(ran%2==0) throw new myException("ODD"); // ������ ȣ�� -> ��ü ����
		System.out.println(ran);
	}

}

class myException extends Exception {
	myException(String msg) {
		super(msg);
	}
}
