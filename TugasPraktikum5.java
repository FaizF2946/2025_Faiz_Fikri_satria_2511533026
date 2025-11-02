package Pekan_lima;

public class TugasPraktikum5 {
	public static void main(String[] args) {
		System.out.println ("#======================#");
		
		for (int i = 1; i <= 4; i++) {System.out.print("| ");
			for (int j = 0; j < (10 - 2 * i); j++) {System.out.print(" ");}
            System.out.print("<>");
            for (int k = 0; k < (2 * i - 2); k++) {System.out.print("..");}
            System.out.print("<>");
            for (int j = 0; j < (10 - 2 * i); j++) {System.out.print(" ");}
            System.out.println(" |");}
		
		
		for (int i = 4; i >= 1; i--) {System.out.print("| ");
            for (int j = 0; j < (10 - 2 * i); j++) {System.out.print(" ");}
            System.out.print("<>");
            for (int k = 0; k < (2 * i - 2); k++) {System.out.print("..");}
            System.out.print("<>");
            for (int j = 0; j < (10 - 2 * i); j++) {System.out.print(" ");}
            System.out.println(" |");
     ;
            }
		
		System.out.println ("#======================#");

	}

}
