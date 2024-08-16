package ScannerExample;

import java.util.Scanner;

public class nextDouble {

	public static void main (String[] args) {
	
		Scanner input = new Scanner(System.in);
		System.out.println("enter the input");
		
		double data = input.nextDouble();  //if double not entered, it converts to double
		System.out.println("data is  "+data);
	}
}
