package threefive;

import java.time.LocalDate;
import java.util.Scanner;

public class Warranty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String purchaseDt=new String();
		int years,months;
		System.out.println("enter purchase date -YYYY-MM-DD");
		Scanner scanner=new Scanner(System.in);
		purchaseDt=scanner.nextLine();
		LocalDate purchaseDate=LocalDate.parse(purchaseDt);
		System.out.println("enetr warranty in years");
years=scanner.nextInt();
months=scanner.nextInt();
scanner.close();
LocalDate warexpDate=purchaseDate.plusYears(years).plusMonths(months);
System.out.println("warranty expires date:"+warexpDate);
	}

}
