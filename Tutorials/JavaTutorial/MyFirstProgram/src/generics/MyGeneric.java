package generics;

public class MyGeneric <Thing,Thing2> {
	Thing x;
	Thing2 y;
	
	MyGeneric(Thing x, Thing2 y){
		this.x = x;
		this.y =y;
	}
	public Thing2 getValueofY() {
		return y;
	}
	public Thing getValueofX() {
		return x;
	}
}
