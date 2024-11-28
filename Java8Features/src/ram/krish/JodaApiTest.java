package ram.krish;

import java.time.LocalDate;
import java.time.LocalTime;

public class JodaApiTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDate date = LocalDate.now();
		System.out.println("current system date::"+date);
		
		int dayOfMonth = date.getDayOfMonth();
		int monthValue = date.getMonthValue();
		int year = date.getYear();
		System.out.println(dayOfMonth+"...."+monthValue+"...."+year);
		
		System.out.printf("%d-%d-%d", dayOfMonth, monthValue, year);
		
		
		System.out.println();
		LocalTime time = LocalTime.now();
		System.out.println("Current System Time::"+time);
		
		int hour = time.getHour();
		int miute = time.getMinute();
		int second = time.getSecond();
		int nanoSecond = time.getNano();
		
		System.out.println(hour+"...."+miute+"...."+second+"....."+nanoSecond);
		
		

	}

}
