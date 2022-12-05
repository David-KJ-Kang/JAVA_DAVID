package testCompile;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Date;
 
public class LocalDateTime 
{
    public static void main(String[] args) throws ParseException 
    {

    	String dateStr = "2021년 06월 19일 21시 05분 07초";
 
        // 문자열
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 MM분 ss초");
        
        // 문자열 -> Date
        Date date = formatter.parse(dateStr);
        
        System.out.println(formatter.format(date)); // Sat Jun 19 21:05:07 KST 2021
        
        
        Date nowDate = new Date();
        System.out.println(nowDate);      // 2021-06-17
        
        // 현재 날짜 구하기 (시스템 시계, 시스템 타임존)
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);      // 2021-06-17
        
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);
        
        
        
 
        // 현재 날짜 구하기(Paris)
        LocalDate parisNow = LocalDate.now(ZoneId.of("Europe/Paris"));
 
        // 결과 출력
        System.out.println(parisNow); // 2021-06-16
        
        
        
        
        
        
    }
}