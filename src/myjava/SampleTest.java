package myjava;

public class SampleTest {
	public static void main(String[] args) {
		Sample sample; // Sample Ÿ���� ��������
		// �޸� ����(stack)�� 4byte(�ü�� ���� �ٸ�����) �� �Ҵ�޾Ƽ� sample�� �����ϰ� �ȴ�
		// �� ������ ������ �� �ִ� �����ʹ� (������) ��ü�� �ּҰ��̴�
		sample = new Sample(); // �޸� ����(Heap)�� ��ü ����
		// =(assign)�� �ǹ� : ������ ��ü�� �ּҰ��� �޸� ����(stack) �� sample�� �����ϴ� ������ ����ȴ�
		
		int count; // ���� = �Ҵ���� �޸� ������ �̸�
		// �޸� ������ 4byte�� �Ҵ� �޾Ƽ� count�� �����ϰ� �ȴ�..
		// �� ������ ������ �� �ִ� �����ʹ� count�� ��
	}

}


class Sample {
	int amount; // Sample class�� ��ü(�ν��Ͻ�) ����
}
