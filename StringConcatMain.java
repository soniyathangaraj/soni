package assignment;

import java.util.Scanner;

public class StringConcatMain
{
	StringConcat sc=new StringConcat();
	System.out.println("1. Add string to itself"); 
	System.out.println("2. replace odd positions with #");
	System.out.println("3. remove duplicate characters in string ");
	System.out.println("4. change odd chracters to upper case");
	System.out.println("enter your choice");
	Scanner s =new Scanner(System.in);
	int choice=s.nextInt();
	switch(choice)
	{
	case1:
		sc.strConcat();
	    break;
     case2:
	    sc.replace();
		break;
     case3:
	    sc.removeDuplicates();
	    break;
	case4:
	    sc.uppercase();
	    break;
	    default:
	    	System.out.println("invalid option");
	}
	
}
}