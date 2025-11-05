package Pekan_enam_2511533026;

import java.util.Scanner;

public class doWhile1_2511533026 {
	public static void main(String[] args) {
	Scanner console = new Scanner (System.in);
		String phrase;
		do {
			System.out.println("Input Password: ");
			phrase = console.next();
		}while (!phrase.equals("abcd"));		
	}
}
