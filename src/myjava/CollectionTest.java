package myjava;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Vector;

public class CollectionTest {
	public static void main(String[] args) {
		// Collection API
		// 동적배열 자료구조, 배열과 유사
		ArrayList list = new ArrayList();
		list.add(55);
		list.add("ㅎㅎ");
		list.add(new Exception());
		
		System.out.println(list.size());
		System.out.println(list.get(1)); // index로 참조한다
		
		Object obj = list.get(2);
		Exception exc = (Exception) obj; // type이 다양하면 꺼낸 후에 형변환 필요
		
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.add(1000);
		int count = list2.get(0); // type을 integer로 통일 -> 형변환 필요 X
		
		Vector<String> list3 = new Vector<String>();
		// Vector와 ArrayList 차이점 : Unlike the new collection implementations, Vector is synchronized. If a thread-safeimplementation is not needed, it is recommended to use ArrayList in place of Vector
		// -> ArrayList가 속도가 더 빠르다, 일반적으로는 ArrayList를 사용하면 된다..
		
		List<String> list4 = new ArrayList<String>();
		// List -> 인터페이스
		
		//map key와 value로 관리하는 콜렉션 자료구조이다
		HashMap map = new HashMap();
		map.put("name", "haha");
		map.put("key", "value");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
