package makechange;

import java.util.Scanner;

public class MakeChange {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		int price, tendered, change;

		System.out.print("What is the price of the item?: $");
		price = (int) Math.round(kb.nextDouble() * 100);

		System.out.print("What is the amount tendered?: $");
		tendered = (int) Math.round(kb.nextDouble() * 100);

		if (tendered > price) {
			System.out.println("Your change is: ");
			change = tendered - price;

			int twenties = change / 2000;
			if (twenties > 0) {
				change %= 2000;
				System.out.println(twenties + " Twenty dollar bill(s) ");
			}
			int tens = change / 1000;
			if (tens > 0) {
				change %= 1000;
				System.out.println(tens + " Ten dollar bill(s) ");
			}
			int fives = change / 500;
			if (fives > 0) {
				change %= 500;
				System.out.println(fives + " Five dollar bill(s) ");
			}
			int ones = change / 100;
			if (ones > 0) {
				change %= 100;
				System.out.println(ones + " One dollar bill(s) ");
			}
			int quarters = change / 25;
			if (quarters > 0) {
				change %= 25;
				System.out.println(quarters + " Quarter(s) ");
			}
			int dimes = change / 10;
			if (dimes > 0) {
				change %= 10;
				System.out.println(dimes + " Dime(s) ");
			}
			int nickels = change / 5;
			if (nickels > 0) {
				change %= 5;
				System.out.println(nickels + " Nickel(s) ");
			}
			int pennies = change;
			System.out.println(pennies + " Pennies ");
			if (price > tendered) {
				System.err.print("Not enough money! ");
			} else if (price == tendered) {
				System.out.print("Thank you for using correct change! ");
			}

			kb.close();
		}
	}
}
