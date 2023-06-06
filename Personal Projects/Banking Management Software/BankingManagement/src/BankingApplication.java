import java.util.*;
public class BankingApplication {
	BankingApplication(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your 'Name' and 'CustomerId' to access your Bank Account");
		String name = sc.nextLine();
		String id = sc.nextLine();
		BankAccount obj1 = new BankAccount(name,id);
		obj1.menu();
	}
	
	
}
