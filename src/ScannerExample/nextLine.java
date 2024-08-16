package ScannerExample;

import java.util.Scanner;

public class nextLine {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter llala");
		String value = input.nextLine();  //takes spaces
		System.out.println("you entered .."+ value);
		
		input.close();
	}

}
