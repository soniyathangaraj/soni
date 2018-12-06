package threesix;

import java.time.ZoneId;
import java.util.Scanner;

public class TimeZoner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new scanner(System.in);
		String zone=new String();
		System.out.println("enter time zone:");
		zone=scanner.nextLine();
		scanner.close();
		ZoneDateTime place=ZoneDateTime.now(ZoneId.of(zone));
		System.out.println("date YYYY-MM-DD:" + place.getYear()+"-"+place.getd]dayOfmonth()+"-" place.getd]dayOfmonth());                           
		System.out.println("24 HOURS HH:MM:SS" + place.getHour()+":"+ place.getHour()+":" place.getHour());

	}

}
