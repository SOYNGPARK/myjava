package myjava;

public class ExceptionTest4 {
	public static void main(String[] args) {
		//Class.forName("myjava.ExceptionTest4");
		// ���� ���� ���� : forName �̶�� �޼ҵ尡 thorws���� ���� �Ǿ� �ֱ� ������ �� �޼ҵ带 �� �� ����ó���� �и��� �ؾ��Ѵ�.
	
		try {
			Class myClass = Class.forName("myjava.ExceptionTest4");
			System.out.println("class name = "+myClass.getName());
			Class myClass2 = Class.forName("xxx");
			System.out.println("class name = "+myClass2.getName());
			//���ڿ��� ���޹��� Ŭ������ �޸𸮷� �ε��ϴ� �޼ҵ�
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.err.println(e.getMessage());
			System.out.println("�׷� Ŭ������ ����");
		}
	}

}
