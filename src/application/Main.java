package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
				
		double hotDog = 4.00;
		double xSalad = 4.50;
		double xBacon = 5.00;
		double simpleToast = 2.00;
		double soda = 1.50;
		
		System.out.println();
		System.out.printf("1 \tHot Dog \tU$ %.2f\n"
				+ "2 \tX-Salad \tU$ %.2f\n"
				+ "3 \tX-Bacon \tU$ %.2f\n"
				+ "4 \tToast \t\tU$ %.2f\n"
				+ "5 \tSoda \t\tU$ %.2f\n", hotDog, xSalad, xBacon, simpleToast, soda);	
		System.out.println();
		System.out.print("Enter the item number consumed: ");
		switch (scanner.nextInt()) {
		case 1:
			System.out.print("Enter the number of items consumed: ");
			System.out.printf("Total: U$ %.2f ", scanner.nextInt() * hotDog);
			break;
		case 2:
			System.out.print("Enter the number of items consumed: ");
			System.out.printf("Total: U$ %.2f ", scanner.nextInt() * xSalad);
			break;
		case 3:
			System.out.print("Enter the number of items consumed: ");
			System.out.printf("Total: U$ %.2f ", scanner.nextInt() * xBacon);
			break;
		case 4:
			System.out.print("Enter the number of items consumed: ");
			System.out.printf("Total: U$ %.2f ", scanner.nextInt() * simpleToast);
			break;
		case 5:
			System.out.print("Enter the number of items consumed: ");
			System.out.printf("Total: U$ %.2f ", scanner.nextInt() * soda);
			break;
		default:
			System.out.print("Invalid item number!");
			break;
		}
		
		scanner.close();
	}

}
