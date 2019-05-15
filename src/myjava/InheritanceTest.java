package myjava;

public class InheritanceTest {
	public static void main(String[] args) {
		Circle circle = new Circle();
		circle.x = 100;
		circle.print();
	}
}

class Shape {
	int x,y;
	Shape() {
		System.out.println("Shape()");
	}
	Shape(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("Shape(int x, int y)");
	}
	void print() {
		System.out.println("x="+x+" y="+y);
	}
}

class Circle extends Shape {
	int radius;
	Circle() { // 상위 클래스에 호출할 생성자(super())가 없으면 오류남
		//super(); // 상위클래스의 생성자 호출, 없어도 자동으로 호출됨
		super(0,0); // 존재하는 생성자를 호출하든가 or 형식이 맞는 생성자를 만들어줘야해
		System.out.println("Circle()");
	}
}

class Rectangle extends Shape {
	int width, height;
}