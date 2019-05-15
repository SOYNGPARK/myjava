package myjava;

public class CoffeShop {
	public static void main(String[] args) {
		System.out.println("****java nara CoffeeShop��������****");
		Beverage[] beverage = new Beverage[5];
		beverage[0] = new Coffee("Cappuccino");
		beverage[1] = new Coffee("CafeLatte");
		beverage[2] = new Tea("ginsengTea");
		beverage[3] = new Coffee("CafeLatte");
		beverage[4] = new Tea("redginsengTea");
		printSalesInfo(beverage);
		System.out.println("�� �Ǹ� �ݾ�==>"+getTotalPrice(beverage));
		System.out.println("Coffe�� �Ǹ� ����=>"+Coffee.amount+"��");
		System.out.println("Tea�� �Ǹ� ����=>"+Tea.amount+"��");
	}

	private static int getTotalPrice(Beverage[] beverage) {
		// TODO Auto-generated method stub
		int totalPrice = 0;
		for(Beverage b : beverage) {
			totalPrice += b.getPrice();
		}
		return totalPrice;
	}

	private static void printSalesInfo(Beverage[] beverage) {
		// TODO Auto-generated method stub
		int count = 1;
		for(Beverage b : beverage) {
			System.out.printf("%d��°�Ǹ�", count++);
			b.print();
		}	
	}
}

abstract class Beverage {
	protected String name;
	protected int price;
	
	public Beverage(String name) {
		this.name = name;
		calcPrice();
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getPrice() {
		return price;
	}
	
	public abstract void calcPrice();
	
	public void print() {
		System.out.printf("����� %s�̸�, ������ %d�Դϴ�.\n", name, price);
	}
}

// ���� Ŭ������ ����� �޼ҵ带 ��ӹ޴� ����Ŭ������ �����ؾ� �Ѵ�
class Coffee extends Beverage {
	public static int amount;

	public Coffee(String name) {
		// TODO Auto-generated constructor stub
		super(name);
		amount++;
	}

	@Override
	public void calcPrice() {
		// TODO Auto-generated method stub
		switch (name) {
			case "Americano" : 
				price = 1500; 
				break;
			case "CafeLatte" : 
				price = 2500; 
				break;
			case "Cappuccino" : 
				price = 3000; 
				break;
			default:
				break;
		}
	}
}

class Tea extends Beverage {
	public static int amount;

	public Tea(String name) {
		// TODO Auto-generated constructor stub
		super(name);
		amount++;
	}

	@Override
	public void calcPrice() {
		// TODO Auto-generated method stub
		switch (name) {
			case "lemonTea" : 
				price = 1500; 
				break;
			case "ginsengTea" : 
				price = 2000; 
				break;
			case "redginsengTea" : 
				price = 2500; 
				break;
			default:
				break;
		}
	}	
}

