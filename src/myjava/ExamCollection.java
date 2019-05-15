package myjava;

import java.util.List;
import java.util.Vector;

public class ExamCollection {
	public static void main(String[] args) {
		int[] arr = new int[10];
		for(int i=0; i<10 ; i++) {
			arr[i] = (int) (Math.random()*100) + 1;
		}
		
		List<Integer> list = extractEvenNumber(arr);
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
	
	static List<Integer> extractEvenNumber(int[] arr) {
		List<Integer> list = new Vector<Integer>();
		for(int e : arr) {
			if(e%2 == 0) {
				list.add(e);
			}
		}
		return list;
	}

}
