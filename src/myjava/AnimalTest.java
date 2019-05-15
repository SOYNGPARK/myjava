package myjava;

public class AnimalTest {
	public static void main(String[] args) {
		Animal animal[] = new Animal[3];
		
		animal[0] = new Dog(8);
		animal[1] = new Chicken(3);
		animal[2] = new CheatableChicken(5);
	
		for(Animal a : animal) {
			if(a instanceof Cheatable) {
				((Cheatable) a).fly();
			}
		}
		
		for(int i = 1 ; i<=3 ; i++) {
			System.out.println(i+"시간후");
			run(animal, 1);
			printDistancesInfo(animal);
		}
	}

	private static void run(Animal[] animal, int hours) {
		// TODO Auto-generated method stub
		for(Animal a: animal) {
			a.run(hours);
		}
	}

	private static void printDistancesInfo(Animal[] animal) {
		// TODO Auto-generated method stub
		for(Animal a : animal) {
			a.print();
		}
	}
}


abstract class Animal {
	int speed;
	double distance;
	
	Animal(int speed) {
		this.speed = speed;
	}
	
	abstract void run(int hours);
	
	double getDistance() {
		return distance;
	}
	
	abstract void print();
}


interface Cheatable {
	abstract void fly();
}


class Dog extends Animal {

	Dog(int speed) {
		super(speed);
		// TODO Auto-generated constructor stub
	}

	@Override
	void run(int hours) {
		// TODO Auto-generated method stub
		distance += speed * (hours*0.5);
	}

	@Override
	void print() {
		// TODO Auto-generated method stub
		System.out.println("개의 이동거리="+this.getDistance());
	}
}


class Chicken extends Animal {
	
	Chicken(int speed) {
		super(speed);
		// TODO Auto-generated constructor stub
	}

	@Override
	void run(int hours) {
		// TODO Auto-generated method stub
		distance += speed * hours;
	}

	@Override
	void print() {
		// TODO Auto-generated method stub
		System.out.println("닭의 이동거리="+this.getDistance());
	}
}


class CheatableChicken extends Animal implements Cheatable {

	CheatableChicken(int speed) {
		super(speed);
		// TODO Auto-generated constructor stub
	}

	@Override
	void run(int hours) {
		// TODO Auto-generated method stub
		distance += speed * hours;
	} 
	
	@Override
	public void fly() {
		// TODO Auto-generated method stub
		speed *= 2;
	}

	@Override
	void print() {
		// TODO Auto-generated method stub
		System.out.println("날으는닭의 이동거리="+this.getDistance());
	}
}
