package makechange;

public class CashRegister {
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("What is the amount of your purchase? ");
		double purchase = sc.nextDouble();
		
		System.out.println("What is the amount of money provided? ");
		double tendered = sc.nextDouble();
		
		int amountDue, twentiesDue, tensDue, fivesDue, onesDue, quartersDue, dimesDue, nickelsDue, penniesDue; 
		
		if (purchase > tendered) {
			System.out.println("Sorry, that's not enough to cover your purchase.");
		}
		
		else if (purchase == tendered) {
			System.out.println("You paid the exact amount of your purchase. Have a great day.");
		}
		
		else {
			amountDue = (int) ((tendered - purchase) *100);
			System.out.println(amountDue);
//			if (amountDue % 100 == 0) {
				
//			}
			
		}
	}
}
