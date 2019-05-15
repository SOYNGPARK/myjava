package myjava;

public class StringTest2 {
	public static void main(String[] args) {
		String str ="math:100,kor:90,eng:50";
		// String classÀÇ method : split, length, startWith, endWith, indexOf...
		String[] list = str.split(",");
		for(String e : list) {
			System.out.println(e);
		}
		// "100" -> 100
		String str2 = "100";
		int math = Integer.parseInt(str2);
		System.out.println(math);
		
	}

}
