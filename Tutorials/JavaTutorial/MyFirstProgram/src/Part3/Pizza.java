package Part3;

public class Pizza {
	String bread;
	String sauce;
	String cheese;
	String topping;

	Pizza(String bread,String sauce,String cheese, String topping){
		this.bread = bread;
		this.sauce = sauce;
		this.cheese= cheese;
		this.topping =topping;
		
	}
	
	Pizza(String bread,String sauce){
		this.bread = bread;
		this.sauce = sauce;
		}
	Pizza(String bread){
		this.bread = bread;
		
		
	}

	@Override
	public String toString() {
		return "Pizza [bread=" + bread + ", sauce=" + sauce + ", cheese=" + cheese + ", topping=" + topping + "]";
	}
}
