package myjava;

import java.util.Calendar;

public class CarTest {
	public static void main(String[] args) {
		Car mcqueen; 
		mcqueen = new Car(); // 생성자 호출 -> heap 영역에 객체가 생성 된다
		// 객체 생성이란? heap 영역에 메모리를 할당하는 과정
		Car hudson = new Car(300); // 정의되지 않은 생성자를 호출하면 오류가 난다
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
		
		System.out.println(mcqueen.name + "의 speed는 " + mcqueen.speed);
		System.out.println(hudson.name + "의 speed는 " + hudson.speed);
		System.out.println(carrera.name + "의 speed는 " + carrera.speed);
		System.out.println(mater.name + "의 speed는 " + mater.speed);
		
		// static 뭐얌?
		hudson.maker = "HD";
		System.out.println(hudson.maker);
		System.out.println(mater.maker);
		mater.maker = "BENZ";
		System.out.println(hudson.maker);
		System.out.println(Car.maker);
		
		Calendar calendar = Calendar.getInstance(); // -> Calendar 클래스 내의 static method
		int today = calendar.get(calendar.DAY_OF_WEEK); // -> DAY_OF_WEEK static이 붙은 클래스 변수
	}

}

class Car { // public class는 두 개 이상 만들지 않는다..
	String name; // 객체 변수 = 각각의 객체가 동일한 값을 갖는다
	int speed;
	static String maker; // 클래스 변수 = 이 클래스로 생성된 모든 객체가 동일한 값을 갖는다
	
	Car() { // 생성자 - 일종의 함수, 리턴 타입이 없다, 클래스와 이름이 동일
		System.out.println("Car");
	}
	
	public Car(int speed) {
		// TODO Auto-generated constructor stub
		this.speed = speed;
	}

	void setName(String name) {
		this.name = name; // 객체 변수(O) 지역 변수(X) 메소드 내에 있더라도 class 내에서 선언되었기 때문
	}
	
	void setSpeed(int speed) {
		this.speed = speed;
	}
	
	int getSpeed() {
		return this.speed;
	}
}
