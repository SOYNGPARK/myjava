package myjava;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class APITest {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance(); // Singleton ����
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd");
		// ����
		Date Today = cal.getTime();
		System.out.println(sdf.format(Today));
		// 100�� ��
		cal.add(Calendar.DATE, 100);
		System.out.println(sdf.format(cal.getTime()));
		// 6���� ��
		cal.add(Calendar.MONTH, 6);
		System.out.println(sdf.format(cal.getTime()));
		
		// ���ڿ��� �ٷ� �� ���� Class -> String, StringTokenizer, StringBuffer, StringBuilder
		// java�� String�� immutable �ϴ� = ���� �Ұ��ϴ�
		// �� ���� Ƚ���� ���ڿ��� ���ϴ� ���� StringBuilder�� ����ϴ� ���� ������ ����
		// String.concat ��ſ� StringBuilder.append !
		
		
		
		
		
		
		
		
		
		
		
	}

}
