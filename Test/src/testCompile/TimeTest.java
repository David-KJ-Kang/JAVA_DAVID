package testCompile;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeTest 
{
	public static void main(String[] args) 
	{
		
		Date now = new Date();
		System.out.println(now);
		
		SimpleDateFormat formatter1;
		SimpleDateFormat formatter2;
		SimpleDateFormat formatter3;
		SimpleDateFormat formatter4;
		SimpleDateFormat formatter5;
		SimpleDateFormat formatter6;
		SimpleDateFormat formatter7;
		SimpleDateFormat formatter8;
		
	
		formatter1 = new SimpleDateFormat("yyyy-MM-dd");
		formatter3 = new SimpleDateFormat("yy/MM/dd");
		formatter2 = new SimpleDateFormat("yyyy년 MM월 dd일 E요일");
		formatter4 = new SimpleDateFormat("HH:mm:ss");
		formatter5 = new SimpleDateFormat("hh:mm:ss a");
		formatter6 = new SimpleDateFormat("오늘은 yyyy년의 w주차이며 D번째 날입니다.");
		formatter7 = new SimpleDateFormat("오늘은 M월의 W번째 주, d번째 날이며, F번째 E요일입니다.");
		formatter8 = new SimpleDateFormat("HH:mm:ss.SSS");
		
		System.out.println(formatter1.format(now));
		System.out.println(formatter2.format(now));
		System.out.println(formatter3.format(now));
		System.out.println(formatter4.format(now));
		System.out.println(formatter5.format(now));
		System.out.println(formatter6.format(now));
		System.out.println(formatter7.format(now));
		System.out.println(formatter8.format(now));

		System.out.println("\n\n\n");
		
		long millis = System.currentTimeMillis();
		System.out.println(millis);
		System.out.println(formatter1.format(millis));
		System.out.println(formatter2.format(millis));
		System.out.println(formatter3.format(millis));
		System.out.println(formatter4.format(millis));
		System.out.println(formatter5.format(millis));
		System.out.println(formatter6.format(millis));
		System.out.println(formatter7.format(millis));
		System.out.println(formatter8.format(millis));
		
		
		
		
		
		
		
		
	
	}
}
