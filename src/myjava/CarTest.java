package myjava;

import java.util.Calendar;

public class CarTest {
	public static void main(String[] args) {
		Car mcqueen; 
		mcqueen = new Car(); // ������ ȣ�� -> heap ������ ��ü�� ���� �ȴ�
		// ��ü �����̶�? heap ������ �޸𸮸� �Ҵ��ϴ� ����
		Car hudson = new Car(300); // ���ǵ��� ���� �����ڸ� ȣ���ϸ� ������ ����
		Car carrera = new Car();
		Car mater = new Car();
		
		mcqueen.setName("Lightning Mcqueen");
		mcqueen.setSpeed(300);
		hudson.setName("Doc Hudson");
		hudson.setSpeed(300);
		carrera.setName("Sally Carrera");
		carrera.setSpeed(200);
		mater.setName("Mater");
		mater.setSpeed(80);
		
		System.out.println(mcqueen.name + "�� speed�� " + mcqueen.speed);
		System.out.println(hudson.name + "�� speed�� " + hudson.speed);
		System.out.println(carrera.name + "�� speed�� " + carrera.speed);
		System.out.println(mater.name + "�� speed�� " + mater.speed);
		
		// static ����?
		hudson.maker = "HD";
		System.out.println(hudson.maker);
		System.out.println(mater.maker);
		mater.maker = "BENZ";
		System.out.println(hudson.maker);
		System.out.println(Car.maker);
		
		Calendar calendar = Calendar.getInstance(); // -> Calendar Ŭ���� ���� static method
		int today = calendar.get(calendar.DAY_OF_WEEK); // -> DAY_OF_WEEK static�� ���� Ŭ���� ����
	}

}

class Car { // public class�� �� �� �̻� ������ �ʴ´�..
	String name; // ��ü ���� = ������ ��ü�� ������ ���� ���´�
	int speed;
	static String maker; // Ŭ���� ���� = �� Ŭ������ ������ ��� ��ü�� ������ ���� ���´�
	
	Car() { // ������ - ������ �Լ�, ���� Ÿ���� ����, Ŭ������ �̸��� ����
		System.out.println("Car");
	}
	
	public Car(int speed) {
		// TODO Auto-generated constructor stub
		this.speed = speed;
	}

	void setName(String name) {
		this.name = name; // ��ü ����(O) ���� ����(X) �޼ҵ� ���� �ִ��� class ������ ����Ǿ��� ����
	}
	
	void setSpeed(int speed) {
		this.speed = speed;
	}
	
	int getSpeed() {
		return this.speed;
	}
}
