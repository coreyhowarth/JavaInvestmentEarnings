/* The example code keeps track of the change in stock price after each trading day. 
A user enters the buying price and the closing price on subsequent trading days. 
then the earnings are evaluated. 
The process stops when a negative closing price is entered. 

Concepts:
While loop
Break command
If-Else statement
Scanner class
DecimalFormat class 

*/

import java.text.*;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your buying price per share: ");
		
		double buyingPrice = scan.nextDouble();
		int day = 1;
		double closingPrice = 0.1;
		
		DecimalFormat df = new DecimalFormat("0.00");
			
		while (true) {
			System.out.println("Enter the closing price for day "
					+ day + " (any negative value to leave: ");
			
			closingPrice = scan.nextDouble();
			
			if (closingPrice < 0.0) break;
			
			double earnings = closingPrice - buyingPrice;
			
			if (earnings > 0.0) {
				System.out.println("After day " + day + ", you earned "
						 + df.format(earnings) + " per share.");
			}
			else if (earnings < 0.0) {
				System.out.println("After day " + day + ", you lost "
						 + df.format(-earnings) + " per share.");
			}
			else {
				System.out.print("After day " + day + ", you have " + 
						"no earnings per share.");
			}
			day += 1;
		}
		scan.close();
	}

}
