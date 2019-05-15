package myjava;

public class SampleTest {
	public static void main(String[] args) {
		Sample sample; // Sample 타입의 지역변수
		// 메모리 공간(stack)에 4byte(운영체제 마다 다르지만) 를 할당받아서 sample로 참조하게 된다
		// 그 공간에 저장할 수 있는 데이터는 (생성할) 객체의 주소값이다
		sample = new Sample(); // 메모리 공간(Heap)에 객체 생성
		// =(assign)의 의미 : 생성된 객체의 주소값이 메모리 공간(stack) 내 sample이 참조하는 공간에 저장된다
		
		int count; // 변수 = 할당받은 메모리 공간의 이름
		// 메모리 공간에 4byte를 할당 받아서 count로 참조하게 된다..
		// 그 공간에 저장할 수 있는 데이터는 count의 값
	}

}


class Sample {
	int amount; // Sample class의 객체(인스턴스) 변수
}
