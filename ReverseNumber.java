package day6;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("Please enter a integer number:");
		int num=scanner.nextInt();
		
		int originalNum=num;
		int reversed=0;
		
		while(num>0)
		{
			int digit =num%10;
			reversed=reversed*10 + digit;
			num=num/10;
		}
		
		System.out.println("Original number is:"+ originalNum);
		System.out.println("Reversed number is:" + reversed);
		

	}

}
