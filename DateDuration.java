package threefour;

import java.time.LocalDate;
import java.util.Scanner;

public class DateDuration {
	public static void main(String[] args) {
		String day=new String();
		String anotherDay=new String();
		System.out.println("enter 2 dates");
		Scanner scanner=new Scanner(System.in);
		day=scanner.nextLine();
		anotherday=scanner.nextLine();
		scanner.close();
		LocalDate date=LocalDate.parse(day);
		LocalDate nowdate=LocalDate.parse(anotherday);
		Period difference=date.until(nowdate);
		System.out.println("difference between the dtae and today date");
		System.out.println("days:"+difference.getDays());
	System.out.println("months:"+difference.getMonths());
	System.out.println("yeras:"+difference.getYears());
		
	}

}
