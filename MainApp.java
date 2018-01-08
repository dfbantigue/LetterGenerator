package app;

import java.util.Scanner;

import oops.HorizontalLetterGenerator;
import oops.VerticalLetterGenerator;

public class MainApp {

	
	public static void main(String[] args)   {
		String arr[] = {"Y","X","Z","L"};
		Scanner scan = new Scanner(System.in);
		HorizontalLetterGenerator hl = new HorizontalLetterGenerator();
		VerticalLetterGenerator vl = new VerticalLetterGenerator();		
		System.out.print("Enter your scale: ");
		int scale = scan.nextInt();
		scan.close();
		try {
			hl.printHorizontal(arr, scale);
			vl.printVertical(arr, scale);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		
		
	} 	
	
}
