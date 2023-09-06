package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner y = new Scanner(System.in);
		System.out.println("Type a year");
		int year = y.nextInt();
		boolean is = (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0);
		System.out.println(year + " is a leap year: " + is);
	}

}
