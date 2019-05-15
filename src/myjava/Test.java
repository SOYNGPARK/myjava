package myjava;

class Test {
	public static void main(String[] args) {
		try {
			new DeliveryService().sell(null);
		} catch (NullPointerException e) {
			// TODO: handle exception
			System.out.println("a");
		}
		System.out.println("b");
	}
	

}

class DeliveryService {
	public void sell(String item) {
		System.out.println(item.toUpperCase());
	}
}
