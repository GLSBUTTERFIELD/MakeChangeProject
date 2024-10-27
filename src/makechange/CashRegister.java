package makechange;

public class CashRegister {
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("What is the amount of your purchase? ");
		double purchase = sc.nextDouble();
		sc.nextLine();

		System.out.println("What is the amount of money provided? ");
		double tendered = sc.nextDouble();
		sc.nextLine();
		sc.close();

		int amountDue = 0, twentiesDue, tensDue, fivesDue, onesDue, quartersDue, dimesDue, nickelsDue, penniesDue;

		if (purchase > tendered) {
			System.out.println("Sorry, that's not enough to cover your purchase.");
		}

		else if (purchase == tendered) {
			System.out.println("You paid the exact amount of your purchase. Have a great day.");
		}

		else {
			amountDue = (int) ((tendered - purchase) * 100);
			System.out.println(amountDue);

			if (amountDue / 2000 > 0) {
				twentiesDue = (amountDue / 2000);
				System.out.print("Your change is " + twentiesDue + " twenties");

				amountDue = amountDue - (twentiesDue * 2000);
			}

			if (amountDue / 1000 > 0) {
				tensDue = (amountDue / 1000);
				System.out.print(", " + tensDue + " tens");
				
				amountDue = amountDue - (tensDue *1000);
			}
			
			if (amountDue / 500 > 0) {
				fivesDue = (amountDue / 500);
				System.out.print(", " + fivesDue + " fives");
				amountDue = amountDue - (fivesDue * 500);
			}
			
			if (amountDue / 100 > 0) {
				onesDue = (amountDue / 100);
				System.out.print(", " + onesDue + " ones");
				amountDue = amountDue - (onesDue * 100);
			}
			
			if (amountDue / 25 > 0) {
				quartersDue = (amountDue / 25);
				System.out.print(", " + quartersDue + " quarters");
				amountDue = amountDue - (quartersDue * 25);
			}
			
			if (amountDue / 10 > 0) {
				dimesDue = (amountDue /10);
				System.out.println(", " + dimesDue + " dimes");
				amountDue = amountDue - (dimesDue *10);
			}
			
			if (amountDue / 5 > 0) {
				nickelsDue = (amountDue / 5);
				System.out.println(", " + nickelsDue + " nickels");
				amountDue = amountDue - (nickelsDue * 5);
			}
			
			else {
				penniesDue = amountDue;
				System.out.println(", and " + penniesDue + " pennies.");
				amountDue = amountDue - penniesDue;
			}
			
			System.out.println("\n" + amountDue);

		}
	}

}
