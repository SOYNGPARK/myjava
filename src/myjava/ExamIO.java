package myjava;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.util.ArrayList;

public class ExamIO {
	public static void main(String[] args) throws Exception {
		ArrayList<Phone> products = new ArrayList<Phone>();
		products = getProductList("phonelist.txt");
		for(int i=0; i<products.size(); i++) {
			Phone product = products.get(i);
			System.out.printf("상품명 : %s\t 가격 : %d\t 브랜드 : %s", 
					product.getName(), product.getPrice(), product.getBrand());
			System.out.println();
		}
	}
	
	static ArrayList<Phone> getProductList(String fileName) throws Exception {
		if(fileName==null) throw new Exception("file name is null");
		
		Reader reader = new FileReader(fileName);
		BufferedReader br = new BufferedReader(reader);
		
		ArrayList<Phone> phones = new ArrayList<Phone>();
		
		while(true) {
			String str = br.readLine();
			if(str == null) {
				break;
			}
			String[] list = str.split(":");
			phones.add(new Phone(list[0], Integer.parseInt(list[1]), list[2]));
		}
		return phones;
	}
}

class Phone {
	String name;
	int price;
	String brand;
	
	Phone(String name, int price, String brand) {
		this.name = name;
		this.price = price;
		this.brand = brand;
	}
	
	String getName() {
		return name;
	}
	
	int getPrice() {
		return price;
	}
	
	String getBrand() {
		return brand;
	}
}
