package myjava;

public class PersonTest {
	public static void main(String[] args) {
		Person who = new Person();
		Person soyoung = new Person(24, "박소영");
		who.selfIntroduce();
		soyoung.selfIntroduce();
		System.out.println("전체 인구는 " +Person.getPopulation()+"명 입니다.");
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
		System.out.println("내 이름은 "+name+"이며, 나이는 "+age+"살 입니다.");
	}
	
	static int getPopulation() {
		return numberOfPersons;
	}
	
}
