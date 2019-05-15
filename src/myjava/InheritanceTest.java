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
	Circle() { // ���� Ŭ������ ȣ���� ������(super())�� ������ ������
		//super(); // ����Ŭ������ ������ ȣ��, ��� �ڵ����� ȣ���
		super(0,0); // �����ϴ� �����ڸ� ȣ���ϵ簡 or ������ �´� �����ڸ� ����������
		System.out.println("Circle()");
	}
}

class Rectangle extends Shape {
	int width, height;
}