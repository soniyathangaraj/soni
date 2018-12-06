package assignment;

import java.util.Scanner;

public class StringConcat {
	Scanner scanner=new Scanner(System.in);
	public void strConcat()
	{
		System.out.println("enter the string");
		String string =scanner.nextInt();
		String s1=string.concat(string);
		System.out.println("the string is adaded to itself"+s1);
	}
	public void replace()
	{
		System.out.println("enter the string");
		String s =scanner.nextInt();
		for(int i=0;i<s.length();i++)
		{
			char currchar=s.charAt(i);
			if(i%2!=0)
			{
				s=s.substring(0,i-1)+"#" +s.substring(i,s.length());
				
			}
		}
		
		System.out.println("the string is replaced with #"+s1);
	}
	public void removeDuplicates()
	{
		System.out.println("enter the string");
		String s =scanner.nextInt();
		StringBuilder sub=new StringBuilder();
		char[]arr=s.toCharArray();
		
		for (char ch:arr)
		{
			if(sub.indexOf(String.valueOf(ch))!=-1)
				continue;
			else
				sub.append(ch);
		}
		
		System.out.println("the duplicate string is "+sub.toString());
	}
	public void uppercase()
	{
		System.out.println("enter the string");
		String string =scanner.nextInt();
		String s2="";
		for(int i=0;i<s.length();i++)
		{
			char character1=s.charAt(i);
			if(i%2!=0)
			{
				char character2=Character.toUpperCase(character1);
				s2=s2+character2;
			}
			else
			
				s2=s2+character1;
			}
			
			
		
	
		System.out.println("the changed string is"+s2);
	}
}
