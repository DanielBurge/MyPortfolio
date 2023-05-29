package filewriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {

		try {
			FileWriter writer = new FileWriter("poem.txt");
			writer.write("Roses are red \n Violets are red \n Chicken Chicken for everyone");
			writer.append("\n A poem by Dj!");
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
