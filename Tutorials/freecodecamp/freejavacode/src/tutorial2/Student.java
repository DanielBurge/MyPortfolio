package tutorial2;
import java.util.ArrayList;
public class Student {
	private String name;
	
	
	public Student(String name) {
		this.name = name;
	}
	public boolean equals(Student other) {
		if (this.name == other.name) {
			return true;
		}else {
			return false;
		}}
		public int compareTo(Student other){
			return this.name.compareTo(other.name);
		}
	}


