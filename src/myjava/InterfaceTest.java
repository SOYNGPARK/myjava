package myjava;

public class InterfaceTest {
	public static void main(String[] args) {
		MyInterfaceImp my = new MyInterfaceImp();
		MyInterface my2 = new MyInterfaceImp();
		System.out.println(my2 instanceof MyInterfaceImp);
	}
}

// 인터페이스는 일종의 추상 클래스이나 내부에 추상메소드만이 존재할 수 있다
interface MyInterface {
	public abstract void print(); //정의(X) only선언(O)
	void write(); // public abstract 을 적지 않아도 default로 적용된다
	public static final int AMOUNT = 500;
	// static final을 붙이면 상수가 된다
	String INTERFACE_NAME = "MYMY"; // static final을 적지 않아도 default로 적용된다
}

class MyInterfaceImp implements MyInterface {

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void write() {
		// TODO Auto-generated method stub
		
	}
	
}
