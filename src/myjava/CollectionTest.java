package myjava;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Vector;

public class CollectionTest {
	public static void main(String[] args) {
		// Collection API
		// �����迭 �ڷᱸ��, �迭�� ����
		ArrayList list = new ArrayList();
		list.add(55);
		list.add("����");
		list.add(new Exception());
		
		System.out.println(list.size());
		System.out.println(list.get(1)); // index�� �����Ѵ�
		
		Object obj = list.get(2);
		Exception exc = (Exception) obj; // type�� �پ��ϸ� ���� �Ŀ� ����ȯ �ʿ�
		
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.add(1000);
		int count = list2.get(0); // type�� integer�� ���� -> ����ȯ �ʿ� X
		
		Vector<String> list3 = new Vector<String>();
		// Vector�� ArrayList ������ : Unlike the new collection implementations, Vector is synchronized. If a thread-safeimplementation is not needed, it is recommended to use ArrayList in place of Vector
		// -> ArrayList�� �ӵ��� �� ������, �Ϲ������δ� ArrayList�� ����ϸ� �ȴ�..
		
		List<String> list4 = new ArrayList<String>();
		// List -> �������̽�
		
		//map key�� value�� �����ϴ� �ݷ��� �ڷᱸ���̴�
		HashMap map = new HashMap();
		map.put("name", "haha");
		map.put("key", "value");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
