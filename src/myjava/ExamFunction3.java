package myjava;

public class ExamFunction3 {
	public static void main(String[] args) {
		int[] lotto = makeArr(6);
		for(int e : lotto) {
			System.out.println(e);
		}
	}

	private static int[] makeArr(int count) {
		// TODO Auto-generated method stub
		int[] result = new int[count];
		for(int i=0; i<result.length; i++) {
			int element = (int) (Math.random()*55) +1;
			while(isDuplicate(element, result)) {
				element = (int) (Math.random()*55) +1;
			}
			result[i] = element;
		}
		return result;
	}

	private static boolean isDuplicate(int element, int[] arr) {
		// TODO Auto-generated method stub
		for(int temp : arr) {
			if(temp == element) return true;
		}
		return false;
	}

}
