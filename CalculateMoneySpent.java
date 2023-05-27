import java.util.Scanner;

public class CalculateMoneySpent{
	public static void main( String[] args) {
		String name;
		int moneySpent;
		int total;
		int totalDay=7;
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is your name?");
		System.out.print("My name is ");
		name=input.next();
		
		System.out.println("How much is monday's spent?");
		moneySpent = input.nextInt();
		total=moneySpent;
		
		System.out.println("How much is tuesday's spent?");
		moneySpent = input.nextInt();
		total=total+moneySpent;
		
		System.out.println("How much is wednesday's spent?");
		moneySpent = input.nextInt();
		total=total+moneySpent;
		
		System.out.println("How much is thursday's spent?");
		moneySpent = input.nextInt();
		total=total+moneySpent;
		
		System.out.println("How much is friday's spent?");
		moneySpent = input.nextInt();
		total=total+moneySpent;
		
		System.out.println("How much is saturday's spent?");
		moneySpent = input.nextInt();
		total=total+moneySpent;
		
		System.out.println("How much is sunday's spent?");
		moneySpent = input.nextInt();
		total=total+moneySpent;
		
		System.out.println("Hi "+name+", your spending this week is $"+total);
		System.out.println("With the average of $"+(total/totalDay)+" per day");
	}
}