package myjava;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class APITest {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance(); // Singleton 패턴
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd");
		// 오늘
		Date Today = cal.getTime();
		System.out.println(sdf.format(Today));
		// 100일 후
		cal.add(Calendar.DATE, 100);
		System.out.println(sdf.format(cal.getTime()));
		// 6개월 후
		cal.add(Calendar.MONTH, 6);
		System.out.println(sdf.format(cal.getTime()));
		
		// 문자열을 다룰 때 쓰는 Class -> String, StringTokenizer, StringBuffer, StringBuilder
		// java의 String은 immutable 하다 = 변경 불가하다
		// 꽤 많은 횟수로 문자열을 합하는 경우는 StringBuilder를 사용하는 것이 성능이 낫다
		// String.concat 대신에 StringBuilder.append !
		
		
		
		
		
		
		
		
		
		
		
	}

}
