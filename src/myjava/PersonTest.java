package myjava;

public class PersonTest {
	public static void main(String[] args) {
		Person who = new Person();
		Person soyoung = new Person(24, "�ڼҿ�");
		who.selfIntroduce();
		soyoung.selfIntroduce();
		System.out.println("��ü �α��� " +Person.getPopulation()+"�� �Դϴ�.");
	}

}

class Person{
	static int numberOfPersons;
	int age;
	String name;
	
	Person() {
		age = 12;
		name = "Anonymous";
		numberOfPersons++;
	}
	
	Person(int age, String name) {
		this.age = age;
		this.name = name;
		numberOfPersons++;
	}
	
	void selfIntroduce() {
		System.out.println("�� �̸��� "+name+"�̸�, ���̴� "+age+"�� �Դϴ�.");
	}
	
	static int getPopulation() {
		return numberOfPersons;
	}
	
}
