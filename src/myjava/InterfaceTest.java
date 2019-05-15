package myjava;

public class InterfaceTest {
	public static void main(String[] args) {
		MyInterfaceImp my = new MyInterfaceImp();
		MyInterface my2 = new MyInterfaceImp();
		System.out.println(my2 instanceof MyInterfaceImp);
	}
}

// �������̽��� ������ �߻� Ŭ�����̳� ���ο� �߻�޼ҵ常�� ������ �� �ִ�
interface MyInterface {
	public abstract void print(); //����(X) only����(O)
	void write(); // public abstract �� ���� �ʾƵ� default�� ����ȴ�
	public static final int AMOUNT = 500;
	// static final�� ���̸� ����� �ȴ�
	String INTERFACE_NAME = "MYMY"; // static final�� ���� �ʾƵ� default�� ����ȴ�
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
