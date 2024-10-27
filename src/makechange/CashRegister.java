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
			amountDue = (int) ((tendered * 100) - purchase * 100);
			System.out.println("Your change is ");

			if (amountDue / 2000 > 0) {
				twentiesDue = (amountDue / 2000);
				if (twentiesDue > 1) {
				System.out.println(twentiesDue + " twenty dollar bills");}
				else {
					System.out.println(twentiesDue + " twenty dollar bill");
				}
				amountDue = amountDue - (twentiesDue * 2000);
			}

			if (amountDue / 1000 > 0) {
				tensDue = (amountDue / 1000);
				if (tensDue > 1) {
				System.out.println(tensDue + " ten dollar bills");
				}
				else {
					System.out.println(tensDue + " ten dollar bill");
				}
				amountDue = amountDue - (tensDue *1000);
			}
			
			if (amountDue / 500 > 0) {
				fivesDue = (amountDue / 500);
				if (fivesDue > 1) {
				System.out.println(fivesDue + " five dollar bills ");}
				else {
					System.out.println(fivesDue + " five dollar bill");
				}
				amountDue = amountDue - (fivesDue * 500);
			}
			
			if (amountDue / 100 > 0) {
				onesDue = (amountDue / 100);
				if (onesDue > 1) {
				System.out.println(onesDue + " one dollar bills"); }
				else {
					System.out.println(onesDue + " one dollar bill");
				}
				amountDue = amountDue - (onesDue * 100);
			}
			
			if (amountDue / 25 > 0) {
				quartersDue = (amountDue / 25);
				if (quartersDue > 1 ) {
				System.out.println(quartersDue + " quarters"); }
				else {
					System.out.println(quartersDue + " quarter");}
				amountDue = amountDue - (quartersDue * 25);
			}
			
			if (amountDue / 10 > 0) {
				dimesDue = (amountDue /10);
				if (dimesDue > 1) {
				System.out.println(dimesDue + " dimes");}
				else {
					System.out.println(dimesDue + " dime");
				}
				amountDue = amountDue - (dimesDue *10);
			}
			
			if (amountDue / 5 > 0) {
				nickelsDue = (amountDue / 5);
				if (nickelsDue > 1) {
				System.out.println(nickelsDue + " nickels");}
				else {
					System.out.println(nickelsDue + " nickel");
				}
				amountDue = amountDue - (nickelsDue * 5);
			}
			
			if (amountDue >= 1) {
				penniesDue = amountDue;
				if (penniesDue > 1) {
				System.out.println(penniesDue + " pennies");}
				else {
					System.out.println(penniesDue + " penny");
				}
				amountDue = amountDue - penniesDue;
			}
		}
	}

}
