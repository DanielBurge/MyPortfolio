package tutorial2;
import java.util.ArrayList;

public class Main { 
	public static void main(String[] args) {
	Student bill = new Student("bill");
	Student tom = new Student("tom"); 
	
	System.out.println(bill.compareTo(tom));
	
	OuterClass out = new OuterClass(); 
	out.inner();
	OuterClass.InnerClass in = out.new InnerClass();
	in.display();
	
	
	}
}
